package de.htw_berlin.ai_bachelor.kbe.date;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by cschulze on 02.12.2015.
 */
public class DateTest {

    Date d;

    @Before
    public void init(){
        d = new Date(13, 7, 2017);
    }

    @Test
    public void testFormatByString() throws Exception {
        String resultFormat = d.format("dd.mm.yyyy");

        assertEquals(resultFormat, "13.7.2017");
    }

    @Test
    public void testFormatByDateFormat() throws Exception {

    }
}