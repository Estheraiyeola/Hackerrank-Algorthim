package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayDivisionTest {

    @Test
    public void testThatTheResultIsCorrect1(){
        SubArrayDivision subArrayDivision = new SubArrayDivision();
        List<Integer> s = new ArrayList<>(List.of(2,2,1,3,2));
        int d = 4;
        int m = 2;

        int result = subArrayDivision.birthday(s, d, m);
        assertEquals(2,result);

    }

    @Test
    public void testThatTheResultIsCorrect2(){
        SubArrayDivision subArrayDivision = new SubArrayDivision();
        List<Integer> s = new ArrayList<>(List.of(1, 2, 1, 3, 2));
        int d = 3;
        int m = 2;

        int result = subArrayDivision.birthday(s, d, m);
        assertEquals(2,result);

    }

    @Test
    public void testThatTheResultIsCorrect3(){
        SubArrayDivision subArrayDivision = new SubArrayDivision();
        List<Integer> s = new ArrayList<>(List.of(1, 1, 1, 1, 1, 1));
        int d = 3;
        int m = 2;

        int result = subArrayDivision.birthday(s, d, m);
        assertEquals(0,result);

    }

    @Test
    public void testThatTheResultIsCorrect4(){
        SubArrayDivision subArrayDivision = new SubArrayDivision();
        List<Integer> s = new ArrayList<>(List.of(4));
        int d = 4;
        int m = 1;

        int result = subArrayDivision.birthday(s, d, m);
        assertEquals(1,result);

    }
    @Test
    public void testThatTheResultIsCorrect5(){
        SubArrayDivision subArrayDivision = new SubArrayDivision();
        List<Integer> s = new ArrayList<>(List.of(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1));
        int d = 18;
        int m = 7;

        int result = subArrayDivision.birthday(s, d, m);
        assertEquals(3,result);

    }

}