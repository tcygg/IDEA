package com.mashibing.lambda.demo03;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
//        consumerString(s -> System.out.println(s));
        consumerString(
                s -> System.out.println(s.toLowerCase()),
                s -> System.out.println(s.toUpperCase())
        );
    }

    static void consumerString(Consumer<String> function) {
        function.accept("Hello");
    }

    static void consumerString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }
}
