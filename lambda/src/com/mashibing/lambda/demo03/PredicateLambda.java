package com.mashibing.lambda.demo03;

import java.util.function.Predicate;

public class PredicateLambda {

    public static void main(String[] args) {
        andMethod(s -> s.contains("H"), s -> s.contains("W"));
        orMethod(s -> s.contains("H"), s -> s.contains("w"));
        negateMethod(s -> s.length() < 5);
    }

    static void andMethod(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.and(two).test("Helloworld");
        System.out.println("字符串符合要求吗：" + isValid);
    }

    static void orMethod(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.or(two).test("Helloworld");
        System.out.println("字符串符合要求吗：" + isValid);
    }

    static void negateMethod(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }
}
