package com.sda.balaceanuale.curs.week8advanced.ex1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
//1. Create enum Planets.
//
//a) Override toString method. It should print relative size of a planet and it’s name.
//E.g. „Huge Jupiter”, „Small Pluto”.
//
//b)  Create distanceFromEarth method.
//
//c) Verify both methods for multiple planets.
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a planet name!");
        String planet = scanner.nextLine();


        try
        {
            Planets planets = Planets.valueOf(planet);
            System.out.println(planets);
            System.out.println("Distance from Earth = " + planets.getDistanceFromEarth());

            switch (planets){
                case MARS:
                    System.out.println("This is planet Mars.");
                    break;
                case EARTH:
                    System.out.println("This is planet Earth.");
                    break;
                default:
                    System.out.println("This is a planet");
            }
        } catch (Exception e)
        {
            System.out.println("Incorect planet name.");

        }
    }
}
