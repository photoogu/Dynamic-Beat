package com.korit.main;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

@AllArgsConstructor
class Authority<T> implements Supplier<T> { // 제네릭 타입을 implement 하면 해당 클래스의 타입도 동일한 제네릭!
    private T role;

    @Override
    public T get() {
        return role;
    }
}

public class Main6 {
    public static void main(String[] args) {
        // 람다식으로 주로 사용되는 인터페이스 종류 (@FunctionalInterface, 추상 메서드가 하나인 인터페이스)
        // 람다는 "익명클래스"에서 나옴! 즉, 임시로 한 번 쓰고 말 것임!

        // Thread(Main 메서드의 역할)
        Runnable runnable; // void run();

        List<Runnable> programs = new ArrayList<Runnable>();

        for(int i = 0; i < 5; i++) {
            final int finalI = i;
            Runnable r = () -> System.out.println("프로그램" + (finalI + 1));
            programs.add( r );  // List<E> E = Runnable, 즉 Runnable 타입의 객체 생성 (람다식 : run() )
        }

        for (Runnable program : programs) {
            program.run();
        }

        // 매개변수로 값을 받아서 해당 값을 처리, 처리한 결과를 return 해주지는 않음 >> forEach 메서드!
        Consumer<String> consumer; // void accept(T t); 가 존재

        // 매개변수로 값을 받지 않고 처리한 데이터를 return 해주는 역할
        Supplier<String> supplier; // T get(); 가 존재 >> getter 만 존재함, 원하는 타입 지정 가능(제네릭)
        Authority<String> authority = new Authority<>("ROLE_ADMIN");
        String role = authority.get(); // getter 로 값을 하나만 받고싶은데, 타입은 자유롭게 두고 싶을 때 Supplier 사용!

        // 매개변수로 값을 받아서 처리한 데이터를 return 해주는 역할
        Function<String, String> function; // Function<T, R> 안에 R apply(T t); 가 존재 >> map 에서 사용!
        Function<Integer, Integer> addFunction = num -> num * 10;
        Integer result = addFunction.apply(100); // num 에 100 대입한 결과(100*10)를 result 에 담음


        Predicate<String> predicate; // Predicate<T> 안에 boolean test(T t); 존재 >> filter 에서 사용!
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());


        BiConsumer<Integer, String> biConsumer; // BiConsumer<T, U> 안에 void accept(T t, U u); 가 존재
        Map<String, Object> userMap = Map.of("username", "admin", "password", "1234"); // (key, value, key, value)
        /*
        * {
        *   "username": "admin",            Map 에서 한 쌍: entry 라고 부름
        *   "password": "1234"
        * }
        * */
        Set<Map.Entry<String, Object>> entries = userMap.entrySet();
        // Set<Map.Entry<K, V>> entrySet(); >> entry 들을 묶어서 Set 으로 묶어라! >> Map 을 Set 으로!
//        for(int i = 0; i < userMap.size(); i++) { } // Set, Map 으로 index i 를 찾을 수 없음
//        for(Integer i : userMap) {}                            // Map 을 for 문에 담을 수 없음
//        for (Map.Entry<String, Object> entry : userMap) {}
        for (Map.Entry<String, Object> entry : entries) {        // Map 을 Set 으로 바꾼 후에 사용 가능!
            entry.getKey();
            entry.getValue();
        } // 이를 아래와 같이 간단하게 할 수 있음
        userMap.forEach((key, value) -> { // forEach 의 매개변수: BiConsumer<Key, Value>
            System.out.println("key: " + key + " value: " + value);
        });

        BiFunction<Integer, Integer, String> biFunction; // BiFunction<T, U, R> 안에 R apply(T t, U u); 가 존재 >> 매개변수가 2개일때
        BiFunction<Integer, Integer, Integer> addBiFunction = (num1, num2) -> num1 + num2;
        Integer result2 = addBiFunction.apply(100, 200);

        BiPredicate<Integer, Integer> biPredicate;


        UnaryOperator<Integer> unaryOperator;
        // UnaryOperator<T> extends Function<T, T> {     >> 상속을 받음. T apply(T t); 메서드가 존재!
        //     static <T> UnaryOperator<T> identity() {  // 매개변수 2개와 리턴타입이 모두 같음
        //         return t -> t;
        // }
        BinaryOperator<Double> binaryOperator;
    }
}
