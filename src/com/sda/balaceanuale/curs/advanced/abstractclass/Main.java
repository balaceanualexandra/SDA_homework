package com.sda.balaceanuale.curs.advanced.abstractclass;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bicycle(50);
        Vehicle vehicle2 = new ElectricBicycle(60);
        Vehicle vehicle3 = new Boat(100);

        vehicle1.move();
        vehicle2.move();
        vehicle3.move();

    }
}
