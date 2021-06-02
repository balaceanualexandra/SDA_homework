package com.sda.balaceanuale.curs.week6coding.exercise2;

public class Animal
{
    private String color;
    private String sound;
    private int noOfLegs;
    private int noOfEyes;

    public Animal()
    {
    }

    public Animal(String color, String sound, int noOfLegs, int noOfEyes)
    {
        this.color = color;
        this.sound = sound;
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    public int getNoOfLegs()
    {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs)
    {
        if (noOfLegs > 0)
        {
            this.noOfLegs = noOfLegs;
        } else
        {
            System.out.println("imvalid numbers of legs");
        }
    }

    public int getNoOfEyes()
    {
        return noOfEyes;
    }

    public void setNoOfEyes(int noOfEyes)
    {
        this.noOfEyes = noOfEyes;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "color='" + color + '\'' +
                ", sound='" + sound + '\'' +
                ", noOfLegs=" + noOfLegs +
                ", noOfEyes=" + noOfEyes +
                '}';
    }
}