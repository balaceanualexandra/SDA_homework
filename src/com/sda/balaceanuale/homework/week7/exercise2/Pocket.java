package com.sda.balaceanuale.homework.week7.exercise2;

public class Pocket
{
    private int money;

    public Pocket(int money)
    {
        this.money = money;
    }

    public int getMoney(int askMoney)
    {
        if (money <= askMoney)
        {
            return 0;

        }
        return money;
    }

    public void setMoney(int money)
    {
        if (money > 0 && money < 3000)
        {
            this.money = money;
        } else
        {
            System.out.println("I don’t have enough space in my pocket for as much money!");
        }
    }

    @Override
    public String toString()
    {
        return "Pocket{" +
                "money=" + money +
                '}';
    }
}
