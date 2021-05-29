package com.sda.balaceanuale.homework.week4.exercise3;

//ex1
public class Car {
    private String brand;
    private String model;
    private int numberOfDoor;
    //ex10
    private Engine engine;
    //ex4
    public Car(String brand, String model, int numberOfDoor, Engine engine) {
        //ex5
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }else {
            System.out.println("Brand sent: " + brand + " is null or empty.");
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }else{
            System.out.println("Model sent: " + brand + " is null or empty.");
        }
        //ex5
        if (numberOfDoor > 0) {
            this.numberOfDoor = numberOfDoor;
        }
        else {
            System.out.println("Numbers of doors" + numberOfDoor + "is not positive.");
        }
        if(engine != null) {
            this.engine = engine;
        }else {
            System.out.println(engine + "is null");
        }

    }
// ex12
    public Engine getEngine() {
        return engine;
    }

    //ex2
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoor=" + numberOfDoor +
                ", engine=" + engine +
                '}';
    }
}
