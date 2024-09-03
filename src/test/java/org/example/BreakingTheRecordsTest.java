package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheRecordsTest {

    @Test
    public  void  testBreakingRecordsMethod1(){
        BreakingTheRecords breakingTheRecords = new BreakingTheRecords();
        List<Integer> scores = new ArrayList<>(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1));
        List<Integer> expected = new ArrayList<>(List.of(2, 4));

        List<Integer> result = breakingTheRecords.getResult(scores);
        assertEquals(expected, result);
    }

    @Test
    public  void  testBreakingRecordsMethod2(){
        BreakingTheRecords breakingTheRecords = new BreakingTheRecords();
        List<Integer> scores = new ArrayList<>(List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        List<Integer> expected = new ArrayList<>(List.of(4, 0));

        List<Integer> result = breakingTheRecords.getResult(scores);
        assertEquals(expected, result);
    }
    @Test
    public  void  testBreakingRecordsMethod3(){
        BreakingTheRecords breakingTheRecords = new BreakingTheRecords();
        List<Integer> scores = new ArrayList<>(List.of(12, 24, 10, 24));
        List<Integer> expected = new ArrayList<>(List.of(1, 1));

        List<Integer> result = breakingTheRecords.getResult(scores);
        assertEquals(expected, result);
    }

}