package com.sda.balaceanuale.curs.week8advanced.ex1;

public enum Planets
{   MARS("huge", 608),
    JUPITER("huge",67),
    SATURN("huge", 89),
    PLUTO("small", 978),
    VENUS("huge", 9872),
    NEPTUN("huge", 98754),
    EARTH("normal", 0);


private String size;
private double distanceFromEarth;

    Planets(String size, double distanceFromEarth)
    {
        this.size = size;
        this.distanceFromEarth = distanceFromEarth;
    }

    public double getDistanceFromEarth()
    {
        return distanceFromEarth;
    }

    @Override
    public String toString()
    {
       return "Planet " + name() + " has size " + size;

    }
}
