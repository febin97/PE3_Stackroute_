package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {
    private static Date objdate;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        objdate = new Date();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        objdate = null;
    }

    @Test
    public void testDate() {
        String date1="First date of the today week: 9/9/2019 " + "Last date of the today week: 15/9/2019 ";
        assertEquals(
                "return date of current week of the type of string",
                date1,objdate.getdate());

    }
    @Test
    public void testDateFailure() {
        String date2="First date of the today week: 15/9/2019" + "Last date of the today week: 9/9/2019";


        assertNotEquals(
                "return date of current week of the type of string",
                date2,objdate.getdate());
    }

}
