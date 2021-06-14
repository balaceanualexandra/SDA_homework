package com.sda.balaceanuale.curs.advanced.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Thread currentThread = Thread.currentThread();
//        repetam de 10 ori urmatoarele doua operatii:
//        1. construieste un fir de executie (treaba asta dureaza multisor)
//        2. porneste firul de executie creat

//        for (int index = 0; index < 10; index++) {
//            CustomThread customThread = new CustomThread();
//            customThread.start();
//        }


        // abordare diferita: construim mai intai toate cele 10 fire de executie,
        // apoi le pornim pe toate, in ordine
        List<Thread> threads = new ArrayList<>();
        // construiesc cele 10 threaduri si le pun in lista
        for (int index = 0; index < 10; index++) {
            threads.add(new CustomThread());
        }
        // pornesc cele 10 threaduri
        for (int index = 0; index < 10; index++) {
            threads.get(index).start();
        }
//      //daca vreau sa bag un thread la somnic
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Good bye! "+ currentThread.getName());
    }
}
