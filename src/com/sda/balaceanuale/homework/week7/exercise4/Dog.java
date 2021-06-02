package com.sda.balaceanuale.homework.week7.exercise4;

public class Dog extends Animal
{
    public Dog(int age, String name, String hairColor)
    {
        super(age, name, hairColor);
    }
    @Override
    public void yieldVoice()
    {
        System.out.println("bark");
    }

}
