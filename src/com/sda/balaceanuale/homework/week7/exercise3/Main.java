package com.sda.balaceanuale.homework.week7.exercise3;

// 1. Create a Shape class.
//a) Add fields, create constructor, getters and setters.
//b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
//Which fields and methods are common?
public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(7);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(10, 18);
        System.out.println(rectangle);
    }
}
