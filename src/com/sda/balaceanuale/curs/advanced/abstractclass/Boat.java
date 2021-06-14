package com.sda.balaceanuale.curs.advanced.abstractclass;

public class Boat extends Vehicle {

    public Boat(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Moving over the water as a boat");
    }
}
