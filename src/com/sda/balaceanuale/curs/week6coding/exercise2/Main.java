package com.sda.balaceanuale.curs.week6coding.exercise2;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.setColor("black");
        animal1.setSound("bark");
        animal1.setNoOfEyes(2);
        animal1.setNoOfLegs(-1);
        System.out.println(animal1);

        if (animal1.getNoOfLegs()==4){
            System.out.println("patruped");
        }
        Animal animal2 = new Animal("brown", "bark", 2, 4);
        System.out.println(animal2);

    }
}
