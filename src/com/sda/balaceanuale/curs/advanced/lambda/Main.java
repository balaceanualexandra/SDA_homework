package com.sda.balaceanuale.curs.advanced.lambda;

public class Main {

    public static void main(String[] args) {
        // inainte de java 8, fara lambda expressions:
        Shape square = new Square();
        System.out.println(square.getArea(4));

        //de la java 8, cu lambda
        Shape shape2 = (x) -> x * x + 23;
        System.out.println(shape2.getArea(4));

        // exemplu cu runnable
        Runnable runnable = () -> {
            System.out.println("Hello from a thread");
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //exemplu cu method reference
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        instanceMethodReference.saySomething();

        Sayable sayable = instanceMethodReference::saySomething;
        sayable.say();

        Sayable sayable2 = InstanceMethodReference::saySomethingStatic;
        sayable2.say();
    }
}
