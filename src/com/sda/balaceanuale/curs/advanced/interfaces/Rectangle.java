package com.sda.balaceanuale.curs.advanced.interfaces;

public class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double whatever() {
        return 42;
    }
}
