package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleSumPairsTest {

    @Test
    public void testThatTheFirstScenarioIsSatisfied(){
        DivisibleSumPairs divisibleSumPairs= new DivisibleSumPairs();
        List<Integer> array = new ArrayList<>(List.of(1, 3, 2, 6, 1, 2));
        int k = 3;
        int n = 6;
        int expected = 5;
        assertEquals(expected, divisibleSumPairs.divide(n, k, array));
    }
    @Test
    public void testThatTheFirstScenarioIsSatisfied2(){
        DivisibleSumPairs divisibleSumPairs= new DivisibleSumPairs();
        List<Integer> array = new ArrayList<>(List.of(8, 10));
        int k = 2;
        int n = 2;
        int expected = 1;
        assertEquals(expected, divisibleSumPairs.divide(n, k, array));
    }

}