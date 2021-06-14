package com.sda.balaceanuale.curs.advanced.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(30, "Bogdan");
        Person person2 = new Person(12, "Thomas");
        Person person3 = new Person(23, "Ion");
        Person person4 = new Person(43, "Thomas");
        Person person5 = new Person(55, "Valerio");
        Person person6 = new Person(23, "Ionas");
        Person person7 = new Person(54, "Thomas");

        List<Person> people = Arrays.asList(person1, person2,
                person3, person4, person5, person6, person7);


        //de aici lucram pentru a afla varsta medie a celor cu nume Thomas
        double sumOfAges = 0;
        int numberOfThomas = 0;
        for (Person person : people) {
            if (person.getName().equals("Thomas")) {
                sumOfAges += person.getAge();
                numberOfThomas++;
            }
        }
        double average = sumOfAges / numberOfThomas;
        //am terminat solutia
        System.out.println("Varsta medie e " + average);

        //cu streams
        OptionalDouble optionalDouble = people.stream()
                .filter(person -> person.getName().equals("Thomas"))
                .mapToDouble(Person::getAge)
                .average();

        if (optionalDouble.isPresent()) {
            System.out.println("varsta medie este " + optionalDouble.getAsDouble());
        } else {
            System.out.println("nu exista varsta medie pentru ca nu exista nici un om numit asa");
        }


        //alt exemplu
        List<String> names = Arrays.
                asList("Andrew", " Brandon", "Michael");
        List namesLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(namesLengths);


        //sort example
        List<Person> collect = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println(collect);


        //toti thomas sortati dupa varsta crescator
        System.out.println("Thomas-ii in ordinea crescatoare a varstei");
        List<Person> result = people.stream()
                .filter(person -> person.getName().equals("Thomas"))
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(result);


    }


}
