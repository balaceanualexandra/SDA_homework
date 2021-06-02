package com.sda.balaceanuale.homework.week7.exercise5;

public class Muzzle
{
   private String color;
   private int lenght;
   private String small;

    public Muzzle(String color, int lenght, String small)
    {
        this.color = color;
        this.lenght = lenght;
        this.small = small;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getLenght()
    {
        return lenght;
    }

    public void setLenght(int lenght)
    {
        this.lenght = lenght;
    }

    public String getSmall()
    {
        return small;
    }

    public void setSmall(String small)
    {
        this.small = small;
    }

    @Override
    public String toString()
    {
        return "Muzzle{" +
                "color='" + color + '\'' +
                ", lenght=" + lenght +
                ", small='" + small + '\'' +
                '}';
    }
}
