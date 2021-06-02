package com.sda.balaceanuale.homework.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static List<Car> search(List<Car>carList, String brand){
        List<Car>result = new ArrayList<>();

        for (Car car : carList) {
            if (car.getBrand().equals(brand))
            {
                result.add(car);
            }
        }

        return result;
    }
}
