package com.sda.balaceanuale.homework.week7.exercise5;

public class Animal
{
    private int age;
    private String name;
    private String hairColor;

    public Animal(int age, String name, String hairColor)
    {
        this.age = age;
        this.name = name;
        this.hairColor = hairColor;
    }

    public void yieldVoice()
    {
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hairColor=" + hairColor +
                '}';
    }
}
