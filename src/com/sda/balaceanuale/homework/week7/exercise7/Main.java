package com.sda.balaceanuale.homework.week7.exercise7;



import java.util.Arrays;

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
