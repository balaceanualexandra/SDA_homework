package com.sda.balaceanuale.curs.week4.part1;

// 1. Declare a `Car` class with the fields:
//        String name,
//        boolean unlocked,
//        boolean started
// 2. We should be able to unlock the car.
//        sout set unlocked to true, "Car is now Unlocked"
// 3. We should be able to lock the car.
//        sout set unlocked to false, "Car is now Locked"
// 4. Add to the Car the attribute: boolean hasDriver
// 5. We should be able to modify the hasDriver field using the methods: "driverEnters()" and "driverLeaves()"
// 6. On the driverEnters() method, add a validation to see if the car is locked. If so, print a error message
// 7. We should be able to start/stop the car's engine
// 8. Add a method that modifies the car's name. The new name should be received as a parameter.
//    Call the method it: "setName()"
// 9. Create GETTERS aka. methods to get the values of the fields for the Car. Hint: You can generate them
// OOP Principles: Encapsulation, Inheritance, Abstractisation, Polymorphism
public class Car {
    // encapsulation
    private String name;
    private boolean unlocked;
    private boolean hasDriver;
    private boolean started;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public boolean isHasDriver() {
        return hasDriver;
    }

    public boolean isStarted() {
        return started;
    }

    int sum(int a,int b){
        return a+b;
    }

    int sum(float a, float b){
        return (int)(a+b);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", unlocked=" + unlocked +
                ", hasDriver=" + hasDriver +
                ", started=" + started +
                '}';
    }

    // Behaviour
    public void unlock() {
        unlocked = true;
        System.out.println(name + " is now Unlocked");
    }

    public void lock() {
        unlocked = false;
        System.out.println(name + " is now Locked");
    }

    public void driverEnters() {
        if (unlocked) {
            hasDriver = true;
        } else {
            System.out.println("The Car is locked and you cannot enter it");
        }
    }

    public void driverLeaves() {
        hasDriver = false;
    }

    public void start(){
        if (hasDriver && !started){
            started = true;
        } else{
            System.out.println("The car has no driver to start it or is already started");
        }
    }

    public void stop(){
        if (hasDriver && started){
            started = false;
        } else if (!started){
            System.out.println("The car is already stopped");
        } else if (!hasDriver){
            System.out.println("The car has no driver");
        }
    }

}
