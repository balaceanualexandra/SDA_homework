package com.sda.balaceanuale.homework.week7.exercise2;

//2. Create class Pocket.
//a) Add field „money”, create constructor, getter and setter.
//b) Add verification for both getter and setter. Getter should result in returning as much
//money, as the user asked for. It should return 0 if money <= 10.
//c) Setter should not accept values below 0 and greater than 3000. It may print a message
//like „I don’t have enough space in my pocket for as much money!
public class Main
{
    public static void main(String[] args)
    {
        Pocket pocket = new Pocket(100);
        System.out.println(pocket.getMoney(120));
        pocket.setMoney(0);
        pocket.setMoney(3010);
        pocket.setMoney(2550);
        System.out.println(pocket);
    }
}
