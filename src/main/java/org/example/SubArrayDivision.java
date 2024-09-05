package org.example;

import java.util.List;

public class SubArrayDivision {
    public int birthday(List<Integer> s, int d, int m) {
        int counter = 0;

        for (int index = 0; index <= s.size() -m; index++) {
            int total = 0;
            for (int idx = 0; idx <m; idx++) {
                total += s.get(index + idx);
            }
            if (total == d){
                counter++;
            }
        }
        return counter;
    }
}
