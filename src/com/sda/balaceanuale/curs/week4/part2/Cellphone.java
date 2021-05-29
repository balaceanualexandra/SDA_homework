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
public class CellPhone {
    static final short MAX_PHONE_NUMBER_LENGHT = 14;
    static final double MIN_INCH_SIZE = 3.5;
    double inchSize;
    String brand;
    String model;
    boolean locked;


    public CellPhone(double inchSize, String brand, String model, boolean locked) {
        if(inchSize < MIN_INCH_SIZE){
            System.out.println("The phone is too small ");
        }else {
            this.inchSize = inchSize;
            this.brand = brand;
            this.model = model;
            this.locked = locked;
        }
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "inchSize=" + inchSize +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", locked=" + locked +
                '}';
    }

    public boolean call(String phoneNumber){
        if (phoneNumber.length() > MAX_PHONE_NUMBER_LENGHT){
            System.out.println("Invalid phone number");
            return false;
        }
        if (locked == false){
            return true;
        } else if (phoneNumber.equals("112") || phoneNumber.equals("911")){
            return true;
        }else{
            return false;
        }


    }
    public boolean checkLock(){
        if (this.locked == true){
            System.out.println("The phone is locked, you need to unlock it.");
        }else {
            System.out.println("The phone is unlock.");
        }
        return locked;
    }

    public void lockingPhone(){
        if (this.locked == false){
            this.locked = true;
            System.out.println("The phone is now lock.");

        }
    }
    public void unlockingPhone(){
        if (this.locked == true){
            this.locked = false;
            System.out.println("The phone is unlocked");
        }
    }


}

