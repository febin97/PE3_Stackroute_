package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    private static ConsecutiveNumber obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new ConsecutiveNumber();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj= null;
    }

    @Test
    public void testDate() {
        String input="98,96,95,94,93";
        String input2="54,53,52,51,50,49,48";
        String input3="1,2,3,4,5,6,6";

        assertEquals(
                "check if the numbers are consecutive",
                "98,96,95,94,93 non consecutive numbers",obj.getconsec(input));
        assertEquals(
                "check if the numbers are consecutive",
                "54,53,52,51,50,49,48 are consecutive numbers",obj.getconsec(input2));
        assertEquals(
                "check if the numbers are consecutive",
                "1,2,3,4,5,6,6 non consecutive numbers",obj.getconsec(input3));

    }
    @Test
    public void testDateFailure() {
        String input3="1,2,3,4,5,6,6";
        assertNotEquals(
                "check if the numbers are consecutive",
                "1,2,3,4,5,5,6 non consecutive numbers",obj.getconsec(input3));

    }

}
