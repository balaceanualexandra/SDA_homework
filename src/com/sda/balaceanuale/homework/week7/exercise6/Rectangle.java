package com.sda.balaceanuale.homework.week7.exercise6;

public class Rectangle extends Shape
{
    private double weight;
    private double lenght;

    public Rectangle(double weight, double lenght)
    {
        this.weight = weight;
        this.lenght = lenght;
    }

    @Override
    public void printShape()
    {
        System.out.println("This is a rectangle");
    }

    @Override
    public double getAria()
    {
        return weight * lenght;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (weight + lenght);
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getLenght()
    {
        return lenght;
    }

    public void setLenght(double lenght)
    {
        this.lenght = lenght;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Rectangle{" +
                "weight=" + weight +
                ", lenght=" + lenght +
                '}';
    }
}
