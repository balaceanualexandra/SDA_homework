package com.sda.balaceanuale.curs.advanced.optional;

public class Person {
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }
    // in mod normal, clasa ar avea mult mai multe campuri, sarim peste acest pas pentru
    // ca nu e relevant aici

    public String getFirstName() {
        return firstName;
    }
}
