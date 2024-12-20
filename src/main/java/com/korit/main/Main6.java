package com.korit.main;

import java.util.function.*;

public class Main6 {
    public static void main(String[] args) {
        // 람다식으로 주로 사용되는 인터페이스 종류
        Runnable runnable;
        Consumer<String> consumer; // void accept(T t); 가 존재
        Supplier<String> supplier;
        Function<String, String> function;
        Predicate<String> predicate;
        BiConsumer<Integer, String> biConsumer;
        BiFunction<Integer, Integer, String> biFunction;
        BiPredicate<Integer, Integer> biPredicate;
        UnaryOperator<Integer> unaryOperator;
        BinaryOperator<Double> binaryOperator;
    }
}
