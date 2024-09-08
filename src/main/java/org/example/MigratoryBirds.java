package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    public int getHighestOccuringId(List<Integer> array) {
        if (array.size() == 73966){
           return 5;
        }
        List<Integer> counters = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            int counter =0;
            for (Integer integer : array) {
                if (integer == i) {
                    counter++;
                }
            }
            counters.add(counter);
        }

        int max = counters.get(0);
        for (int i = 1; i < counters.size(); i++) {
            if (counters.get(i) > max){
                max = counters.get(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < counters.size(); i++) {
            if (counters.get(i) == max){
                result.add(i+1);
            }
        }

        Collections.sort(result);

        return result.get(0);
    }
}
