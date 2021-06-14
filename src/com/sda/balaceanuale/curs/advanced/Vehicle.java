package com.sda.balaceanuale.curs.advanced;

public class Vehicle extends Object {
    public int yearOfProduction = 2000;

    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Sunt in constructorul Vehicle");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void showDetails() {
        System.out.println("Max speed este " + maxSpeed);
    }
    public void showDetails(boolean allDetails){
        if(allDetails){
            System.out.println("Year of production is "+yearOfProduction);
        }
        showDetails();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }
}
