package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.Exception;
import static org.junit.Assert.*;

public class MainTest {
    private static MainException obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new MainException ();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;
    }

    @Test(expected = Exception.class)
        public void StringException() throws Exception {
            String s="hello world";
            obj.main(s);
        }
}