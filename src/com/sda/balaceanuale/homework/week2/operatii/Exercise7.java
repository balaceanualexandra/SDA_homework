package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise7
{
    //Exercitiul 7:
    //Sa se scrie un program ce citeste de la tastatura 3 numere. 2 numere intregi si un numar cu zecimale.
    //Sa se salveze intr-o variabila rezultatul mediei aritmetice a celor 3 numere si apoi sa se afiseaze pe ecran acea variabila.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int intvar1 = scanner.nextInt();
        System.out.println("Primul numar introdus:" + intvar1);

        System.out.println("Introduceti al doilea numar: ");
        int intvar2 = scanner.nextInt();
        System.out.println("Al doilea numar introdus: " + intvar2);

        System.out.println("Introduceti un numar cu zecimale: ");
        double doubleVar1 = scanner.nextDouble();
        System.out.println("Al treilea numar introdus: " + doubleVar1);

        double result = (intvar1 + intvar2 + doubleVar1) / 3;
        System.out.println("Media aritmetica: " + result);


    }
}