package com.korit.main;


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 {
    public static void main(String[] args) {
//        ForEachPrinter2<Integer> ifp =new ForEachPrinter2<>(); // new ~ <> -> 앞에 명시되어있기 때문에 Integer 생략 가능
                                                                 // ForEach~<> 에 아무것도 없을 시, Object 가 생략되어있는 것
        String[] names = new String[] {"a", "b", "c"};
        ForEachPrinter2.print(names);

        Integer[] numbers = new Integer[] {1, 2, 3};
        ForEachPrinter2.print(numbers);

        //=======================================================//

        List<String> datas = ForEachPrinter2.print2(Arrays.asList(names), data -> System.out.println(data));

        List<Integer> list = List.of(1, 2, 3, 4, 5); // List.of() -> 불변 리스트, 즉 상수! (add, delete 등의 수정 불가)
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);  // 불변 리스트를 가변 리스트로 바꿈 >> 수정 가능!
        list2.add(10);
        List<Integer> list3 = list.stream().collect(Collectors.toList()); // stream 으로 가변 리스트 생성 >> 수정 가능!
        list3.add(20);
    }

    public static boolean test() {
//        boolean result = false;
//        result = 10 % 2 == 0;
//        return result;            // 클린 코드이긴 하나, 축약해도 됨

        return 10 % 2 == 0;           // 리펙터링!
    }
}
