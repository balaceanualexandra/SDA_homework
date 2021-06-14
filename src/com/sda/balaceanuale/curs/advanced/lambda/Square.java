package com.sda.balaceanuale.curs.advanced.lambda;

public class Square implements Shape {

    @Override
    public double getArea(double side) {
        return side * side + 23;
    }
}
