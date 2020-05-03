package com.prashant21tube.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        //Consumer can accept only wrapper class not the primitive
        //How lambda expression get executed input parameters (), token ->, body explanation {}
        Consumer<String> cons1 = (s) -> {System.out.println(s.toUpperCase());};
        //cons1.accept("java8");
        Consumer<String> cons2 = (s) -> System.out.println(s.toLowerCase());;
        cons2.accept("ABCD");

        cons1.andThen(cons2).accept("java8");
    }
}
