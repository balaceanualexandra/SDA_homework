package com.sda.balaceanuale.homework.week7.exercise6;

public class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void printShape()
    {
        System.out.println("This is a circle");
    }

    @Override
    public double getAria()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Circle{" +
                "radius=" + radius +
                '}';
    }
}
