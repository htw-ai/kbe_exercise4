package de.htw_berlin.ai_bachelor.kbe.date;

/**
 * Created by cschulze on 02.12.2015.
 */
public enum DateFormat {

    ISO("yyyy-mm-dd"), US("mm/dd/yyyy"), CH("dd.mm.yyyy");

    private String format;

    DateFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
