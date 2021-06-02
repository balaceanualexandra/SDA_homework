package com.sda.balaceanuale.homework.week7.exercise7;

import com.sda.balaceanuale.homework.week7.exercise5.Muzzle;

public class Dog extends Animal
{
    private Muzzle muzzle;

    public Dog(int age, String name, String hairColor)
    {
        super(age, name, hairColor);
    }
    @Override
    public void yieldVoice()
    {
        System.out.println("bark");
    }

    public Dog(int age, String name, String hairColor, Muzzle muzzle)
    {
        super(age, name, hairColor);
        this.muzzle = muzzle;
    }

    public Muzzle getMuzzle()
    {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle)
    {
        this.muzzle = muzzle;
    }
}