package org.example;

import java.util.List;

public class DivisibleSumPairs {
    public int divide(int n, int k, List<Integer> array) {
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && (array.get(i) + array.get(j)) % k == 0){
                    counter++;
                }
            }

        }
        return counter;
    }
}
