package com.sda.balaceanuale.homework.week7.exercise3;

public class Shape
{
    private double aria;
    private double perimeter;

    public Shape(double aria, double perimeter)
    {
        this.aria = aria;
        this.perimeter = perimeter;
    }

    public double getAria()
    {
        return aria;
    }

    public void setAria(double aria)
    {
        this.aria = aria;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

    @Override
    public String toString()
    {
        return "Shape{" +
                "aria=" + aria +
                ", perimeter=" + perimeter +
                '}';
    }
}
