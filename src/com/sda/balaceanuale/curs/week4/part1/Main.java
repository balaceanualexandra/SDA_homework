package com.sda.balaceanuale.curs.week4.part1;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("BMX", 1);
        Bicycle bicycle2 = new Bicycle("Mountain-Bike", 2);

        bicycle1.changeGear(2);
        bicycle2.changeGear(3);

        System.out.println(bicycle1.brand);
        System.out.println(bicycle1.gear);
        System.out.println();
        System.out.println(bicycle2.brand);
        System.out.println(bicycle2.gear);

        Bicycle bicycle3 = new Bicycle();
        bicycle3.gear = 1;
        bicycle3.brand = "Pegas";

        bicycle3.changeGear(2);
    }
}