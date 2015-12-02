package de.htw_berlin.ai_bachelor.kbe.date;

import java.util.Scanner;

/**
 * Created by cschulze on 02.12.2015.
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String format(DateFormat format) {
        return format(format.getFormat());
    }

    public String format(String pattern) {
        //pattern = "dd.mm.yyyy";

        Scanner sc = new Scanner(pattern);
        sc.useDelimiter("dmy");

        StringBuilder rsultBuilder = new StringBuilder();

        while (sc.hasNext()) {
            if (sc.hasNext(".-/;:")) {
                rsultBuilder.append(sc.next());
            } else if (sc.hasNext("dd")) {
                rsultBuilder.append(day);
                sc.next();
            } else if (sc.hasNext("mm")) {
                rsultBuilder.append(month);
            } else if (sc.hasNext("yyyy")) {
                rsultBuilder.append(year);
            } else {
                rsultBuilder.append(sc.next());
            }
        }

        return rsultBuilder.toString();
    }

}
