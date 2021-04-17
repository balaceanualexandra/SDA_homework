package com.sda.balaceanuale.homework.week1;

public class ExercisesNr7
{

    //Sa se declare 2 variabile de tip int si 2 de tip long.
    // Doua dintre ele se vor declara in blocuri de cod diferite
    // si se vor afisa in toate blocurile in care aceste variabile sunt scop.
    //Doua variabile se vor declara in blocul de cod al metodei main
    // si se vor afisa in toate blocurile in care sunt in scop.
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        {
            long c = 10000, d = 20000;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
        }
    }
}

