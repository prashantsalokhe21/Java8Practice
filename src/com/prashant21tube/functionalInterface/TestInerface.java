package com.prashant21tube.functionalInterface;

/**
 * A functional interface can have only one Abstract method as shown below
 * Lambda expression can be used to represent the instance of functional interface
 * This can contain default and static methods as shoe=wn below
 */

@FunctionalInterface
public interface TestInerface {

    public void add();

    default String display(){
        return "Hello Prashant";
    }

    static boolean isTrue() {
        return false;
    }
}
