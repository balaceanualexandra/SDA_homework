package com.sda.balaceanuale.curs.advanced;

public class Person {

    private String name;
    private boolean male;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(!name.equals("Bogdan") ){
            this.name = name;
        }
    }
}
