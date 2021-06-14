package com.sda.balaceanuale.curs.advanced;

public class Car extends Vehicle {
    public int yearOfProduction = 2020;
    private boolean isConvertible;


    public Car(int maxSpeed, boolean isConvertible) {
        super(maxSpeed);
        this.isConvertible = isConvertible;
        System.out.println("Sunt in constructorul Car");
    }


    public boolean isConvertible() {
        return isConvertible;
    }


    @Override
    public void showDetails() {
        System.out.println("isConvertible este " + isConvertible);
        super.showDetails();
    }


    @Override
    public String toString() {
        return "Car{" +
                "isConvertible=" + isConvertible +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
