package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileUpperTest {
    private static FileUpper obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new FileUpper();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;
    }

    @Test
    public void FileUpperTest() throws IOException {
        String filecontent="Welcome to StackRoute"; //create a file and write this content in your file
        int count=21;
        String res=filecontent.toUpperCase()+" "+count;
        assertEquals(res,obj.show());

    }

    @Test
    public void FileUpperTestFailure() throws IOException {
        String filecontent="Welcome to StackRoute"; //create a file and write this in your file
        int count=31;
        String res=filecontent.toUpperCase()+" "+count;
        assertNotEquals(res,obj.show());

        String newfilecontent="Welcome to StackRoute Bangalore"; //create a file and write this in your file
        int newcount=21;
        String newres=newfilecontent.toUpperCase()+" "+newcount;
        assertNotEquals(newres,obj.show());
    }

}
