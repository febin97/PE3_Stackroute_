package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchFileExtensionTest {
    private static SearchFileExtension obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new SearchFileExtension();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;
    }

    @Test
    public void FileExtensionTest()
    {

        String filecontent_1="Welcome to StackRoute"; // check folder in the com.stackroute there is one folder and it contains file there
        assertEquals(filecontent_1,obj.getcontent(".txt"));

        String filecontent_2 ="package com.stackroute.Folder;\n" +
                "\n" +
                "public class file_java {\n" +
                "    public static void main(String args[])\n" +
                "    {\n" +
                "        System.out.println(\"hello world\");\n" +
                "    }\n" +
                "}\n"; // check folder in the com.stackroute there is one folder and it contains file there
        assertEquals(filecontent_2,obj.getcontent(".java"));
    }
    @Test
    public void FileExtensionTestFailure()
    {
        String filecontent_1="Welcome to StackRoutee"; // check folder in the com.stackroute there is one folder and it contains file there
        assertNotEquals(filecontent_1,obj.getcontent(".txt"));

        String filecontent_2 ="ppackage com.stackroute.Folder;\n" +
                "\n" +
                "public class file_java {\n" +
                "    public static void main(String args[])\n" +
                "    {\n" +
                "        System.out.println(\"hello world\");\n" +
                "    }\n" +
                "}\n"; // check folder in the com.stackroute there is one folder and it contains file there
        assertNotEquals(filecontent_2,obj.getcontent(".java"));
    }

}
