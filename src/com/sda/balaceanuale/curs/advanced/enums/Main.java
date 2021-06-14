package com.sda.balaceanuale.curs.advanced.enums;

public class Main {
    public static void main(String[] args) {
        LengthUnit firstLengthUnit = LengthUnit.METER;
        LengthUnit secondLengthUnit = LengthUnit.FOOT;
        LengthUnit thirdLengthUnit = LengthUnit.INCH;
        LengthUnit forthLengthUnit = LengthUnit.MILE;

        firstLengthUnit.displayInfo();
        secondLengthUnit.displayInfo();
        thirdLengthUnit.displayInfo();
        forthLengthUnit.displayInfo();

        switch (thirdLengthUnit) {
            case METER: {
                System.out.println("e metru");
                break;
            }
            case FOOT: {
                System.out.println("e foot");
                break;
            }
            default: {
                System.out.println("E altceva");
            }
        }

    }
}
