package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummatrixTest {
    private static Summatrix objmatrix;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        objmatrix = new Summatrix();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        objmatrix = null;
    }

    @Test
    public void matrixsum() {
        int rows=3;
        int column=3;

        int firstmatrix[][] = {{11, 24,10}, {65, 40,10},{80,30,10}};
        int secondmatrix[][] = {{11, 24,10}, {65, 40,10},{80,30,10}};

        int blankone[][] = {};
        int blanktwo[][] = {};


        int resultmatrix[][] = {{22, 48,20}, {130, 80,20},{160,60,20}};
        int wrongresultmatrix[][] = {{72, 48,20}, {130, 80,20},{160,60,20}};

        objmatrix.set_dimen(rows,column);
        assertEquals(resultmatrix,objmatrix.calc(firstmatrix,secondmatrix));
        assertNotEquals(wrongresultmatrix,objmatrix.calc(firstmatrix,secondmatrix));
        assertEquals("null",objmatrix.calc(blankone,blanktwo));
    }


    @Test
    public void matrixsumFailure() {
        int rows=3;
        int column=3;
        int firstmatrix[][] = {{11, 24,10}, {65, 40,10},{80,30,10}};
        int secondmatrix[][] = {{11, 24,10}, {65, 40,10},{80,30,10}};
        int wrongresultmatrix[][] = {{72, 48,20}, {130, 80,20},{160,60,20}};

        objmatrix.set_dimen(rows,column);
        assertNotEquals(wrongresultmatrix,objmatrix.calc(firstmatrix,secondmatrix));


    }

}
