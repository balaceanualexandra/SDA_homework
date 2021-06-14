package com.sda.balaceanuale.curs.advanced.concurrency.customThread2;

public class Main {
    public static void main(String[] args) {
        CustomThread2 customThread2 = new CustomThread2();

        Thread customThread = new Thread(customThread2);
        customThread.start();
    }
}
