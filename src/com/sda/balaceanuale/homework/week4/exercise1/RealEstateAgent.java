package com.sda.balaceanuale.homework.week4.exercise1;
//ex optional1
import java.util.List;

public class RealEstateAgent {

    public House findCheapestHouse(List<House> houses)
    {
        if(houses.isEmpty())
        {
            return null;
        }

        House cheapestHouse = houses.get(0);

        for (House house : houses) {
            if (cheapestHouse.getPrice() > house.getPrice()){
                cheapestHouse=house;
            }
        }

        return cheapestHouse;
    }

}
