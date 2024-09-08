package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdsTest {
    @Test
    public void testFirstScenario(){
        MigratoryBirds migratoryBirds = new MigratoryBirds();
        List<Integer> array = new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        assertEquals(3, migratoryBirds.getHighestOccuringId(array));
    }
    @Test
    public void testSecondScenario(){
        MigratoryBirds migratoryBirds = new MigratoryBirds();
        List<Integer> array = new ArrayList<>(List.of(1, 4, 4, 4, 5, 3));
        assertEquals(4, migratoryBirds.getHighestOccuringId(array));
    }

}