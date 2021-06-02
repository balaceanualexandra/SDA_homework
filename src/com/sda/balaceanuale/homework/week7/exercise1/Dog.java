package com.sda.balaceanuale.homework.week7.exercise1;

public class Dog
{
    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    public Dog(String name, int age, String gender, String race, int weight)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race)
    {
        this("", 0, gender, race, 0);
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }else{
            System.out.println("Invalid age received");
        }
    }

    public void setWeight(int weight)
    {
        if (weight > 0)
        {
            this.weight = weight;
        } else
        {
            System.out.println("Invalid weight received");
        }
    }
}
