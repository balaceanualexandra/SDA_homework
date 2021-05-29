package com.sda.balaceanuale.homework.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {
        System.out.println(new Car("Ford", "Mondeo", 5, new Engine(65, 3200)));
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Mondeo", 5, new Engine(65, 3200)));
        carList.add(new Car("Ford", "Fiesta", 4, new Engine(88, 2100)));
        carList.add(new Car("Seat", "Arona", 4, new Engine(99, 4200)));
        carList.add(new Car("Skoda", "Octavia", 4, new Engine(120, 2300)));
        carList.add(new Car("Dacia", "Duster", 4, new Engine(60, 1200)));

        for (Car car : carList) {
            System.out.println(car);
        }
        List<Car> fordCars = CarManager.search(carList, "Ford");
        for (Car fordCar : fordCars) {
            System.out.println(fordCar);
        }


        System.out.println();
    }
}
