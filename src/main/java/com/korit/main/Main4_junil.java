package com.korit.main;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4_junil {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2_ji = null;
        List<Integer> numberList2_ji_1 = null;
        List<Integer> numberList2_ji_2 = null;
        List<Integer> numberList2_ji_3 = null;

        // 일반 for 문
        numberList2_ji = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            numberList2_ji.add(numberList.get(i)*10);
        }

        // 향상된 for 문
        numberList2_ji_1 = new ArrayList<>();
        for (Integer num : numberList) {
            numberList2_ji_1.add(num*10);
        }

        // 람다식 사용
     //   numberList2_ji_2 = new ArrayList<>();                     // java 는 선언과 함수 먼저 작동
     //   numberList.forEach(num -> numberList2_ji_2.add(num*10));  // 즉, null 인 상태에서 람다식이 먼저 작동된 후 위의 줄이 작동

        // stream 사용
        numberList2_ji_3 = numberList.stream()
                        .map(num -> num * 10)
                        .collect(Collectors.toList());

        List<Integer> numberList2 = new ArrayList<>(numberList);
        numberList.forEach(num -> numberList2.add(num));

        System.out.println(numberList);     //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(numberList2_ji);
        System.out.println(numberList2);
    }
}
