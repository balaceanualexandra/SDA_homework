package com.sda.balaceanuale.curs.advanced.enums;

public enum LengthUnit {
    METER(1, "Meter"), FOOT(0.3048, "US Foot "),
    MILE(1609, "US Mile"), INCH(0.0254, "US Inch");


    LengthUnit(double value, String prettyName) {
        this.value = value;
        this.prettyName = prettyName;
    }

    private double value;
    private String prettyName;

    public void displayInfo() {
        System.out.println("One " + prettyName + " has " + value + " meters");
    }
}
