package de.htw_berlin.ai_bachelor.kbe.date;

import java.util.Scanner;

/**
 * Created by cschulze on 03.12.2015.
 */
public class DataFormatter {

    private static Date _date;

    public static String formatDate(DateFormat format) throws Exception{
        switch (format) {
            case ISO: // yyyy-mm-dd
                return String.format("%04d", _date.getYear()) + "-" + String.format("%02d", _date.getMonth())  + "-" + String.format("%02d", _date.getDay());
            case US: // mm/dd/yyyy
                return String.format("%02d", _date.getMonth()) + "/" + String.format("%02d", _date.getDay()) + "/" + String.format("%04d", _date.getYear());
            case CH: // dd.mm.yyyy
                return  String.format("%02d", _date.getDay()) + "." + String.format("%02d", _date.getMonth()) + "." + String.format("%04d", _date.getYear());
            default:
                throw new Exception("Date format '" + format.name() + "' is not defined!");
        }
    }

    public static void setDate(int day, int month, int year){
        _date = new Date(day, month, year);
    }



    //## ############### experimental ###############

    public String format(DateFormat format) {
        return format(format.getFormat());
    }

    public String format(String pattern) {

        Scanner sc = new Scanner(pattern);
        sc.useDelimiter("[^dmy]");
        //sc.useDelimiter("[^.-/;:\\.]");

        StringBuilder rsultBuilder = new StringBuilder();

        while (sc.hasNext()) {
            if (sc.hasNext("[^.-/;:\\.]")) {
                rsultBuilder.append(sc.next());
            } else if (sc.hasNext("[dd]")) {
                rsultBuilder.append(_date.getDay());
                sc.next();
            } else if (sc.hasNext("[mm]")) {
                rsultBuilder.append(_date.getMonth());
                sc.next();
            } else if (sc.hasNext("[yyyy]")) {
                rsultBuilder.append(_date.getYear());
                sc.next();
            } else {
                rsultBuilder.append(sc.next());
            }
        }

        return rsultBuilder.toString();
    }
}
