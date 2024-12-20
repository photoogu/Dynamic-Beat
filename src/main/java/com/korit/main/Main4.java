package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<Integer> numberList2_2 = null;
        List<Integer> numberList3 = null;

        numberList2 = new ArrayList<>();
        for (Integer number : numberList) {
            numberList2.add(number*10);
        }

        numberList2_2 = new ArrayList<>(numberList);
        for (int i = 0; i < numberList.size(); i++) {
            numberList2_2.set(i, numberList.get(i)*10);
        }

        numberList3 = numberList.stream()
                        .map(num -> num*10)
                        .collect(Collectors.toList());

        System.out.println(numberList);     //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(numberList2);    //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        System.out.println(numberList2_2);  //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        System.out.println(numberList3);    //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]


    }
}
