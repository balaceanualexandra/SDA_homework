package com.sda.balaceanuale.curs.advanced;

public class PolymorphismExample {

    public static void main(String[] args) {
        // 1: overriding
        Vehicle vehicle = new Vehicle(123);
        Car car = new Car(456, true);

        Vehicle carVehicle = new Car(180, false);

        carVehicle.showDetails();
        System.out.println(carVehicle.yearOfProduction);
        System.out.println(carVehicle.getYearOfProduction());


        // 2: overloading
        System.out.println("metoda cu un parametru:");
        carVehicle.showDetails(true);
        System.out.println("metoda fara parametri:");
        carVehicle.showDetails();
    }
}
