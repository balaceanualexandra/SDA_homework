package com.sda.balaceanuale.curs.advanced.interfaces;

public class Circle implements Shape, RoundEdges {

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
