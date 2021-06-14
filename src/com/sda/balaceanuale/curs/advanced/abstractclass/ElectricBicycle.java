package com.sda.balaceanuale.curs.advanced.abstractclass;

public class ElectricBicycle extends Bicycle {

    public ElectricBicycle(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Moving like a bicycle on green energy");
    }


}
