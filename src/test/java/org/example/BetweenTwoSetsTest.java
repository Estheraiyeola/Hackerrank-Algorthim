package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    @Test
    public void testThatTheNumbersBetweenTheTwoArraysCanBeGotten(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> array1 = new ArrayList<>();
        array1.add(2);
        array1.add(6);
        List<Integer> array2 = new ArrayList<>();
        array2.add(24);
        array2.add(36);


       int numbers = betweenTwoSets.findNumbers(array1, array2);


        assertEquals(2, numbers);


    }

    @Test
    public void testThatTheNumbersBetweenTheTwoArraysCanBeGotten2(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> array1 = new ArrayList<>();
        array1.add(2);
        array1.add(4);
        List<Integer> array2 = new ArrayList<>();
        array2.add(16);
        array2.add(32);
        array2.add(96);


        int numbers = betweenTwoSets.findNumbers(array1, array2);

        assertEquals(3, numbers);


    }

    @Test
    public void testThatTheNumbersBetweenTheTwoArraysCanBeGotten3(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> array1 = new ArrayList<>();
        array1.add(2);

        List<Integer> array2 = new ArrayList<>();
        array2.add(20);
        array2.add(30);
        array2.add(10);


        int numbers = betweenTwoSets.findNumbers(array1, array2);

        assertEquals(1, numbers);


    }

    @Test
    public void testThatTheNumbersBetweenTheTwoArraysCanBeGotten4(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> array1 = new ArrayList<>();
        array1.add(1);

        List<Integer> array2 = new ArrayList<>();
        array2.add(72);
        array2.add(48);



        int numbers = betweenTwoSets.findNumbers(array1, array2);

        assertEquals(8, numbers);


    }
}