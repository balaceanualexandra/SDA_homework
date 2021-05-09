package com.sda.balaceanuale.curs.week4.part1;

public class Aquarium {

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.name = "Phil";
        System.out.println(fish1.name); //"Phil"

        Fish fish2 = fish1;
        System.out.println(fish2.name); //"Phil"

        fish1.swim();

        Fish.getAnimalType();
        System.out.println(Fish.numberOfFishes);

        // Garbage Collector
        fish1 = null;
        fish2 = null;
        // Garbage Collector (GC) - becomes eligible/prompt
        // to destroy the unreferenced objects on the heap
    }
}
