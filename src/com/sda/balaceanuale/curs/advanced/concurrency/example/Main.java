package com.sda.balaceanuale.curs.advanced.concurrency.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bench bench = new Bench(1);
        List<Thread> threads = new ArrayList<>();

        for (int index = 0; index < 100; index++) {
            threads.add(new SeatTakerThread(bench));
        }

        for (int index = 0; index < 100; index++) {
            threads.get(index).start();
        }

        System.out.println("Locks: " + bench.getLocks());

    }
}
