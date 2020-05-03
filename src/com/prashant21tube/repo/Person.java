package com.prashant21tube.repo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int height;
    private int age;
    private double salary;
    private List<String> hobbies = new ArrayList<>();

    public Person(String name, int height, int age, double salary, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
