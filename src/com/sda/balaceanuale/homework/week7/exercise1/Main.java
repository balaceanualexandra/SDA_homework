package com.sda.balaceanuale.homework.week7.exercise1;

//1. Create class Dog.
//a) Add private fields to the class, like name, age, gender, race, weigth.
//b) Create constructor that accepts all of the class fields.
//c) Create additional constructor, that will accept only gender and race. It should call main
//constructor with default values.
//d) Create getters and setters for age and weigth.
//e) Create object of class Dog. Verify if everything works as expected.
//f) Add verification for all arguments passed to the setters. E.g. setWeigth method should
//not accept values below or equal to 0.
public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Alma", 8,"Female", "Rottweiler", 45);
        System.out.println(dog.getAge() + " - Age dog. ");
        System.out.println(dog.getWeight() + " -  Weight dog.");

        Dog dog2 = new Dog("male", "pitbull");
        System.out.println(dog2.getAge() + " - Age dog. ");
        System.out.println(dog2.getWeight() + " -  Weight dog.");

        dog2.setAge(0);
        dog2.setWeight(0);
    }

}
