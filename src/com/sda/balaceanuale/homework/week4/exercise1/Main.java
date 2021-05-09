package com.sda.balaceanuale.homework.week4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ex2
        House house1 = new House();
        //house1.addBedrooms(3);
        //house1.addBathrooms(1);
        //house1.addSquareMeters(46);
        //house1.addFloors(5);
        //ex5
        house1.setBathrooms(5);
        house1.setSquareMeters(234);
        house1.setFloors(6);
        house1.setBathrooms(4);
        house1.setPrice(76890);

        //ex3
        House house2 = new House(278, 1, 2, 5, 1234);

        House house3 = new House(0, 0, 0, 0, 0);

        //ex6
        System.out.println(house1.getPricePerSquareMeter());

        //ex7
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

        //ex8
        System.out.println("--------------------------------------------------------");
        List<House> houseList = new ArrayList<>();

        houseList.add(new House(678, 6, 10, 10, 123456));
        houseList.add(new House(897, 10, 3, 30, 23456));
        houseList.add(new House(78, 2, 2, 1, 3456));
        houseList.add(new House(67, 3, 3, 3, 2346));
        houseList.add(new House(678, 14, 3, 3, 283456));

        for (House house : houseList) {
            System.out.println(house);
        }
        System.out.println("--------------------------------------------------------");

        //ex optional1
        RealEstateAgent agentCheap = new RealEstateAgent();
        System.out.println("cheapest house: " + agentCheap.findCheapestHouse(houseList));


    }
}
