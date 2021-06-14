package com.sda.balaceanuale.curs.advanced.concurrency.example;

public class Bench {

    private int numberOfAvailableSeats;
    private int locks = 0;

    public Bench(int numberOfAvailableSeats) {
        this.numberOfAvailableSeats = numberOfAvailableSeats;
    }

    public void takeASeat() {
        Thread currentThread = Thread.currentThread();
        if (numberOfAvailableSeats > 0) {
            synchronized (this) {
                System.out.println("Lock obtained!");
                locks++;
                if (numberOfAvailableSeats > 0) {
                    System.out.println(currentThread.getName() + " is taking a seat");
                    numberOfAvailableSeats--;
                    System.out.println(currentThread.getName() + " free seats left: " + numberOfAvailableSeats);
                    return;
                }
            }
        }
        System.out.println(currentThread.getName() + " doesn't have a seat available");

    }

    public int getLocks() {
        return locks;
    }
}
