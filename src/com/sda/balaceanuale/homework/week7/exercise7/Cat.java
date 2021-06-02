package com.sda.balaceanuale.homework.week7.exercise7;


public class Cat extends Animal
{
    public Cat(int age, String name, String hairColor)
    {
        super(age, name, hairColor);
    }

    @Override
    public void yieldVoice()
    {
        System.out.println("meow");
    }

}
