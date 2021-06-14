package com.sda.balaceanuale.curs.advanced.inputOutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private List<Person> friends = null;
    private Wallet wallet;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(Person person) {
        friends.add(person);
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                ", wallet=" + wallet +
                '}';
    }
}
