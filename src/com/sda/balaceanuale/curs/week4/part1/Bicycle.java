package com.sda.balaceanuale.curs.week4.part1;

public class Bicycle {
    // STATE fields declaration
    String brand;
    int gear;

    // constructor - instantiate object's fields
    Bicycle() {
    }

    Bicycle(String brand, int gear) {
        this.brand = brand;
        this.gear = gear;
    }

    // BEHAVIOUR - methods
    public void changeGear(int gear) {
        if (gear <=0){
            System.out.println("Negative gear");
        }
        else {
            this.gear = gear;
        }
    }
}

