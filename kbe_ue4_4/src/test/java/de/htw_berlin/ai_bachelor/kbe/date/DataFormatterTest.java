package de.htw_berlin.ai_bachelor.kbe.date;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by cschulze on 03.12.2015.
 */
public class DataFormatterTest {

    //DataFormatter formatter;

    @Before
    public void init(){
        DataFormatter.setDate(13, 7, 2017);
    }


    @Test
    public void testFormatDateISO() throws Exception {
        String date = DataFormatter.formatDate(DateFormat.ISO);
        assertEquals(date, "2017-07-13");
    }

    @Test
    public void testFormatDateUS() throws Exception {
        String date = DataFormatter.formatDate(DateFormat.US);
        assertEquals(date, "07/13/2017");
    }

    @Test
    public void testFormatDateCH() throws Exception {
        String date = DataFormatter.formatDate(DateFormat.CH);
        assertEquals(date, "13.07.2017");
    }
}