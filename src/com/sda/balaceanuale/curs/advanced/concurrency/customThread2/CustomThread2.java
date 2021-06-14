package com.sda.balaceanuale.curs.advanced.concurrency.customThread2;

public class CustomThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello from a custom thread!");
    }
}
