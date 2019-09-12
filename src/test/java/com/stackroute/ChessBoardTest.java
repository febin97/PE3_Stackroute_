package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    private static ChessBoard objchess;
    String[][] arr= {
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
    };
    String[][] arr2= {
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","BB|"}
    };

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        objchess = new ChessBoard();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        objchess = null;
    }

    @Test
    public void testChessBoard() {

        assertEquals(
                "return 2D array with WW|BB| pattern",
                this.arr,objchess.getchess());
    }
    @Test
    public void testDateFailure() {

        assertNotEquals(
                "2D array returned doesnt matched with the expected.check your logic",
                this.arr2,objchess.getchess());

    }

}
