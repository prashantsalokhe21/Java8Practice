package com.prashant21tube.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getPersonList(){
        Person p1 = new Person("Prashant Salokhe", 180,38, 10000, Arrays.asList("Cricket","Traveling"));
        Person p2 = new Person("Kunal Patil", 160,32, 50000, Arrays.asList("Cricket","Traveling"));
        Person p3 = new Person("Abhijeet Sawant", 175,40, 40000, Arrays.asList("Cricket","Cooking"));
        Person p4 = new Person("Sujit Nalawade", 171,37, 30000, Arrays.asList("Basketball","Traveling"));
        Person p5 = new Person("Sandeep Desai", 182,36, 20000, Arrays.asList("Vollyball","Traveling"));

        return Arrays.asList(p1,p2,p3,p4,p5);
    }

}
