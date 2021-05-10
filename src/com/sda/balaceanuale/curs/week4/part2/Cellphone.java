package com.sda.balaceanuale.curs.week4.part2;

///**
// * 1. Create a Cellphone class with the attributes/fields:
// * inchSize, brand, model, locked
// * 2. Write/generate the constructor with all the parameters
// * 3. Create a MIN_INCH_SIZE static variable that defines the minimum size a cellphone can have
// * 4. Validate on the constructor that the size respects the minimum size requirement
//5. Create a method call(String phoneNumber). Check if the phone is unlocked to make the call. If the call is to 911 or 112, let the user call even with the phone locked.
//6.  Create a methods for locking/unlocking the phone
//7. In the call method, check that the phone number is shorter than 14 characters. hint: Use a static constant to hold the value "14" */
public class Cellphone
{
    static final double MIN_INCH_SIZE = 1;
    double inchSize;
    String brand;
    String model;
    boolean locked;

    public Cellphone(double inchSize, String brand, String model, boolean locked)
    {
        if (inchSize > MIN_INCH_SIZE)
        {
            this.inchSize = inchSize;
        } else
        {
            System.out.println("Phone size error");
        }
        this.brand = brand;
        this.model = model;
        this.locked = locked;
    }

    @Override
    public String toString()
    {
        return "Cellphone{" +
                "inchSize=" + inchSize +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", locked=" + locked +
                '}';
    }

    public boolean call(String phoneNumber)
    {
        if (!locked)
        {
            return true;
        } else if (phoneNumber.equals("112") || phoneNumber.equals("911"))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean checkLock()
    {
        if (this.locked == true)
        {
            System.out.println("The phone is lockComand, you need yo unlock it.");
        } else
        {
            System.out.println("The phone is unlock");
        }
        return this.locked;

    }

    public void lockingPhone()
    {
        if (this.locked == false)
        {
            this.locked = true;
            System.out.println("The phone is unlocked");
        }
    }

    public void unlockingphone()
    {
        if (this.locked == true)
        {
            this.locked = true;
            System.out.println("The phone is lockeed");
        }
    }

}

