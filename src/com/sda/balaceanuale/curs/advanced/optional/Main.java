package com.sda.balaceanuale.curs.advanced.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        Optional<Person> optionalPerson = dbService.findByEmail("floricica_dansatoarea@judele.com");
        if (optionalPerson.isPresent()) {
            // cutia are continut, continutul cutiei este prezent :)
            Person person = optionalPerson.get();
            System.out.println(person.getFirstName());
        } else {
            //cutia este goalaaaa!!!!
            System.out.println("Nu am primit nimic");
        }

        Optional<Integer> asd;

    }
}
