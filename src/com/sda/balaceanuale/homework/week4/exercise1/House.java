package com.sda.balaceanuale.homework.week4.exercise1;

public class House {
    //ex1
    private int squareMeters;
    private int bedrooms;
    private int bathrooms;
    private int floors;
    private double price;
    //ex3
    //un constructor este o metoda fara tip de return , fara nimic, nici macar void
    //constructorul trebuie sa aiba acelasi nume ca si numele clasei.
    public House (){

    }

    public House(int squareMeters, int bedrooms, int bathrooms, int floors, double price) {
        if (squareMeters > 0) {
            this.squareMeters = squareMeters;
        }
        else
        {
            System.out.println("squareMeters must be bigger than 0");
        }

        if ( bedrooms > 0) {
            this.bedrooms = bedrooms;;
        }
        else
        {
            System.out.println("bedrooms must be bigger than 0");
        }

        if ( bathrooms > 0) {
            this.bathrooms = bathrooms;
        }
        else
        {
            System.out.println("bathrooms must be bigger than 0");
        }

        if ( floors > 0) {
            this.floors = floors;
        }
        else
        {
            System.out.println("floors must be bigger than 0");
        }
        if ( price > 0) {
            this.price = price;
        }
        else
        {
            System.out.println("price must be bigger than 0");
        }
    }

    // folosim this cand ne referim la campurile , metodele, contructorii clasei curente;
    //ex2
   /* public void addBedrooms (int bedrooms){
        this.bedrooms += bedrooms;
    }
    public void addSquareMeters(int squareMeters) {
        this.squareMeters += squareMeters;
    }
    public void addBathrooms(int bathrooms ){
        this.bathrooms +=bathrooms;
    }
    public void addFloors(int floors) {
        this.floors +=floors;
    }*/

    //ex4
    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPricePerSquareMeter(){
        return price/squareMeters;
    }


    //ex7
    //generate -> to String

    @Override
    public String toString() {
        return "House{" +
                "squareMeters=" + squareMeters +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", floors=" + floors +
                ", price=" + price +
                '}';
    }
}
