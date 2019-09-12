package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NegativeExceptionTest {
    private static NegativeException obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new NegativeException();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void NegativeArraySize() throws Exception {
        obj.negativemethod();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void IndexoutofBounds() throws Exception {
        obj.indexmethod();
    }

    @Test(expected = NullPointerException.class)
    public void NullPointer() throws Exception {
        obj.nullmethod();
    }

}
