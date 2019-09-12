package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class VowelTest {
    private static Vowel objvowel;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        objvowel = new Vowel();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        objvowel = null;
    }

    @Test
    public void vowel() {
        List<String> result = new ArrayList<String>(
                Arrays.asList("Place Name without Vowels:0 ind",
        "Place Name without Vowels:1 ntd Stts",
        "Place Name without Vowels:2 Grmny",
        "Place Name without Vowels:3 gypt",
        "Place Name without Vowels:4 czchslvk"));

        List<String> resultwrong = new ArrayList<String>(
                Arrays.asList("Place Name without Vowels:0 ind",
                        "Place Name without Vowels:1 ntd Stts",
                        "Place Name without Vowels:2 Grmn",
                        "Place Name without Vowels:3 gypt",
                        "Place Name without Vowels:4 czchslvk"));

        List<String> input = new ArrayList<String>(Arrays.asList("India","United States","Germany","Egypt", "czechoslovakia"));

        assertEquals(result,objvowel.getvowel(input));
        assertNotEquals(resultwrong,objvowel.getvowel(input));
    }

    @Test
    public void vowelFailure()
    {
        List<String> resultwrong = new ArrayList<String>(
                Arrays.asList("Place Name without Vowels:0 ind",
                        "Place Name without Vowels:1 ntd Stts",
                        "Place Name without Vowels:2 Grmn",
                        "Place Name without Vowels:3 gypt",
                        "Place Name without Vowels:4 czchslvk"));

        List<String> input = new ArrayList<String>(Arrays.asList("India","United States","Germany","Egypt", "czechoslovakia"));
        assertNotEquals(resultwrong,objvowel.getvowel(input));
    }

}
