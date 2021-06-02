package com.sda.balaceanuale.homework.week4.exercise3;
//ex6
public class Engine {
   private int horsePower;
   private int capacity;
   public Engine(int horsePower, int capacity){
       if (horsePower >0){
           this.horsePower= horsePower;

       }else{
           System.out.println(horsePower + "is not positive");
       }
       if (capacity > 0){
           this.capacity= capacity;

       }else
           System.out.println(capacity + "is not positive");
   }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                '}';
    }
}
