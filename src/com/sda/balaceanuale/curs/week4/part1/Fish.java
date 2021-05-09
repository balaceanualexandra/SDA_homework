package com.sda.balaceanuale.curs.week4.part1;// 1. Declare a Fish class having the attributes: weight, name
//        Don't declare any constructor
// 2. The fish should be able to "swim" (System.out.println("I'm swimming"))
// 3. The fish should be able to "hide" idem2
//
// 4. Modify the `swim` method to print something like "Phil is swimming"
// 5. Modify the `hide` method to print something like "Phil is hiding"

public class Fish {
    static int numberOfFishes = 0;
    String name;
    int weight;

    Fish(){
        numberOfFishes++;
    }

    public void swim(){
        System.out.println("I'm swimming");
    }

    public void hide(){
        System.out.println("I'm hiding");
    }

    public static void getAnimalType(){
        System.out.println("Fish!");
    }

}
