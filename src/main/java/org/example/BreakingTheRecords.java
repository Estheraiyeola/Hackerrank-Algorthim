package org.example;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public List<Integer> getResult(List<Integer> scores) {
        List<Integer> highest = new ArrayList<>();
        List<Integer> lowest = new ArrayList<>();

        int highestCounter = 0;
        int lowestCounter = 0;


        highest.add(scores.get(0));
        lowest.add(scores.get(0));

        for (int index = 1; index < scores.size(); index++) {
            if (scores.get(index) > scores.get(index -1)){
                highest.add(scores.get(index));
                lowest.add(lowest.get(index-1));
            } else if (scores.get(index) < scores.get(index-1)) {
                lowest.add(scores.get(index));
                highest.add(highest.get(index-1));
            }
            else {
                highest.add(highest.get(index-1));
                lowest.add(lowest.get(index-1));

            }
        }
        System.out.println(highest);
        System.out.println(lowest);

        int highestNumber = highest.get(0);
        int lowestNumber = lowest.get(0);

        for (int idx = 1; idx < highest.size(); idx++) {
            if (highest.get(idx) > highestNumber){
                highestNumber = highest.get(idx);
                highestCounter++;
            } else if (lowest.get(idx) < lowestNumber) {
                lowestNumber = lowest.get(idx);
                lowestCounter++;
            }
        }

        return List.of(highestCounter, lowestCounter);
    }

}
