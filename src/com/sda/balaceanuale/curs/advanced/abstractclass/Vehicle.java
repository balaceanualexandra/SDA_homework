package com.sda.balaceanuale.curs.advanced.abstractclass;

public abstract class Vehicle {

    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void move();
}
