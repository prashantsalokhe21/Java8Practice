package com.prashant21tube.stream;

import com.prashant21tube.repo.Person;
import com.prashant21tube.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
        s1.forEach(s -> System.out.println(s));
        System.out.println("======================");
        Stream<Integer> s2 = Stream.of(new Integer[] {1,2,3,4,5,6});
        s2.forEach(s -> System.out.println(s));

        Predicate<Person> p1 = (person -> person.getHeight() >= 180);
        Predicate<Person> p2 = (person -> person.getAge() >= 38);

        Map<String, List<String>> personMap = PersonRepository.
                getPersonList() //iterate all persons
                .stream() //Stream of persons
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Person :: getName, Person::getHobbies));

        System.out.println("Person hobbies" + personMap);
    }
}
