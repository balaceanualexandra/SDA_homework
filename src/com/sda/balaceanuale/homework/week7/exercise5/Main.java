package com.sda.balaceanuale.homework.week7.exercise5;

public class Main
{
    public static void main(String[] args)
    {
        Muzzle muzzle = new Muzzle("black", 2, "fine");
        Dog dog = new Dog(7, "Max", "brown", muzzle);
        System.out.println(dog.getMuzzle().getColor() + "- color muzzle");
        System.out.println(dog.getMuzzle().getSmall() + " - small muzzle");
        System.out.println(dog.getMuzzle().getLenght() + " - lenght muzzle");
        System.out.println(dog.getAge() + "- age dog");
        System.out.println("hair dog " + dog.getHairColor());
        System.out.println("dog name " + dog.getName());
    }
}
