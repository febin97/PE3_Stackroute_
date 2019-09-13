package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FrequencyWordsTest {
    private static FrequencyWords obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new FrequencyWords();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;
    }

    @Test
    public void FileFrequencyTest() throws IOException {
        //create and write this in your file filedemo.txt make sure you provide a valid path of the directory while creating file path object

        //i am a man ,
        //i like to sleep ,
        //i have a home.

        List<String> str=new ArrayList<String>(
                Arrays.asList(
                        "a-2",
                        "am-1",
                        "have-1",
                        "home-1",
                        "i-3",
                        "like-1",
                        "man-1",
                        "sleep-1",
                        "to-1"
                )                                                   // return Sorted List
        );
        assertEquals(str,obj.frequencycalculate());


    }

    @Test
    public void FileFrequencyTestFailure() throws IOException {

        //write this in your file filedemo.txt

        //i am a boy ,
        //i like to sleep ,
        //i have a home.

        List<String> str2=new ArrayList<String>(
                Arrays.asList(
                        "i-3 times,",
                        "am-1,",
                        "like-1,",
                        "have-1,",
                        "a-2,",
                        "man-1",
                        "to-1",
                        "sleep-1",
                        "home-1"
                )
        );
        assertNotEquals(str2,obj.frequencycalculate());
    }

}