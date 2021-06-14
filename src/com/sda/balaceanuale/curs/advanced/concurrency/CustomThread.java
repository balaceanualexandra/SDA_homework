package com.sda.balaceanuale.curs.advanced.concurrency;

public class CustomThread extends Thread {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Hello, my name is " + currentThread.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye, my name is " + currentThread.getName());
    }
}
