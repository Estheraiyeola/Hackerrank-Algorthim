package org.example;

import java.util.*;

public class BetweenTwoSets {

    public int findNumbers(List<Integer> a, List<Integer> b) {
        List<Integer> numbersBetween = new ArrayList<>();
        List<Integer> numbersNeeded = new ArrayList<>();
        int lengthOfArray1 = a.size();
        int lengthOfArray2 = b.size();
        Collections.sort(a);
        Collections.sort(b);
        int rangeStart = (a.size() >= 2) ? a.get(1) : a.get(0) + 1;
        int rangeEnd = b.get(0);

        for (int i = rangeStart; i <= rangeEnd; i++) {
            numbersBetween.add(i);
        }



        for (int number : numbersBetween) {
            boolean isValid = true;
            for (int a1 = 0; a1 < lengthOfArray1; a1++) {
                if (number % a.get(a1) != 0){
                    isValid = false;
                    break;
                }
            }
            if (isValid){
                for (int a2 = 0; a2 < lengthOfArray2; a2++) {
                    if (b.get(a2) % number != 0){
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid){
                numbersNeeded.add(number);
            }
        }


        System.out.println(numbersBetween);
        System.out.println(numbersNeeded);
        return numbersNeeded.size();
    }
    //        for (int number = 0; number < numbersBetween.size(); number++) {
//            for (int a1 = 0; a1 < lengthOfArray1; a1++) {
//                for (int a2 = 0; a2 < lengthOfArray2; a2++) {
//                    counter++;
//                    if (numbersBetween.get(number) % array1[a1] == 0 && array2[a2] % numbersBetween.get(number) == 0 && counter == lengthOfArray2){
//                        numbersNeeded.add(numbersBetween.get(number));
//                    }
//                }
//                counter = 0;
//            }
//        }
}
