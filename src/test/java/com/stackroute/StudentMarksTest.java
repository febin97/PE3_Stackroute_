package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentsMarks objstudentmarks;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        objstudentmarks = new StudentsMarks();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        objstudentmarks = null;
    }

    @Test
    public void teststudent() {
        int no_of_student = 5;
        int a[] = {11, 24, 65, 40,80};
        objstudentmarks.set_no(no_of_student);
        assertEquals(
                "File name extraction failed. File name can be found after a space after from clause. Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
                "Success",  objstudentmarks.set_grade(a));
    }


    @Test
    public void teststudentFailure() {
        int no_of_student = 4;
        int a[] = {1, 2, -5, 4};
        objstudentmarks.set_no(no_of_student);
        assertEquals(
                "File name extraction failed. File name can be found after a space after from clause. Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
                "Error Message",  objstudentmarks.set_grade(a));
        }

    }
