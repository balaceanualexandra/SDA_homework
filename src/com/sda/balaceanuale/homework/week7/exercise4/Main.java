package com.sda.balaceanuale.homework.week7.exercise4;

import java.util.Arrays;

//2. Create classes Dog and Cat.
//a) Move common methods and fields to the class Animal.
//b) Create method „yieldVoice”.
//c) Create simple array of type Animal, that will contain one object of type Dog and
//one object of type Cat.
//d) Using for-each loop show which animal gives what kind of voice. How to print a
//name of an object?
public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[2];
        animals [0] = new Dog(10, "Rex", "black");
        animals[1] = new Cat(5,"Lili", "white");
        System.out.println(Arrays.toString(animals));
        for (Animal animal : animals)
        {
            animal.yieldVoice();
        }

    }
}
