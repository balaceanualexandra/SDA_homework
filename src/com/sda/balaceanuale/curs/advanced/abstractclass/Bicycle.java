package com.sda.balaceanuale.curs.advanced.abstractclass;

public class Bicycle extends Vehicle {

    public Bicycle(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Moving like a bicycle");
    }


}
