package com.prashant21tube.functionalInterface;

/**
 * Project: Java8Practice
 * Package: com.prashant21tube.functionalInterface
 * <p>
 * User: Prashant
 * Date: 8/8/2020
 * Time: 9:47 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        Intref i = () -> System.out.println("Lambada expression implemented.");
        i.m1();
    }
}
