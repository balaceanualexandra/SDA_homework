package com.sda.balaceanuale.curs.week4.part1;

import java.util.Arrays;
import java.util.List;

public class Exercise {

    // Create a Car reference pointing to a Car object
    // Set the name for the car
    // Play around with the Car's methods. ( at least 4 method calls )
    public static void main(String[] args) {

        Car car1 = new Car("Car");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");
        Car car4 = new Car("Car4");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);
        System.out.println("List size is: " + cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();

        for (Car car : cars) {
            System.out.println(car);
        }

//        String a = "Alfabet";
//        System.out.println(a.contains("be"));

    }
}
