package com.prashant21tube.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        //Consumer can accept only wrapper class not the primitive
        //How lambda expression get executed input parameters (), token ->, body explanation {}
        Consumer<String> cons1 = (s) -> {System.out.println(s.toUpperCase());};
        cons1.accept("java8");
    }
}
