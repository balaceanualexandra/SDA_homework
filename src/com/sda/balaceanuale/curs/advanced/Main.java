package com.sda.balaceanuale.curs.advanced;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(123, true);
        car.showDetails();

        System.out.println();

        Vehicle vehicle = new Vehicle(222);
        vehicle.showDetails();
        System.out.println("TO STRING!!!!!!!!!!!!!!!!!!!\n\n\n");
        System.out.println(car);
        System.out.println(vehicle);

    }
}
