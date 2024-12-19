package com.korit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPrinter2 {

    public static <T> void print(T[] array) {
        // static 에서는 클래스가 생성될 때의 제네릭 타입을 받을 수 없음, 리턴 자료형 앞에 제네릭 사용 가능
        // 클래스에서 선언된 제네릭 타입과 static 메서드에서 선언된 제네릭 타입은 다름!
        // 즉, 클래스에서 선언된 제네릭 타입은 static 에서 사용 불가
        for (T data : array) {
            System.out.println(data);
        }
    }
//    public static void print(Object[] array) { // 업캐스팅 형태. 다운캐스팅이 필요하므로 불편함.
//        for (Object data : array) {            // >> 제네릭 타입을 쓰는 이유!
//            System.out.println(data);
//        }
//    }
    public static <T> List<T> print2(List<T> datas, Consumer<List<T>> action) {
//        List<T> result = new ArrayList<>();
//        for (T data : datas) {
//            System.out.println(data);
//            result.add(data);
//        } 이를 아래와 같이 작성 가능 (람다식 사용)
        List<T> result = new ArrayList<>();
        action.accept(datas);

        // return "스태틱 제네릭"; > 오류! R 타입의 데이터를 지정해주어야 함.
        return result;
    }


}
