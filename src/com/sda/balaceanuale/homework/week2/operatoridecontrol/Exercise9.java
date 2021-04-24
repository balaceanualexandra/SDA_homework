package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise9
{
    //Exercitiul9:
    //  Sa se scrie un program care citeste 2 numere de la tastatura.
    //  Sa se calculeze si sa se afiseze cel mai mare numar dintre cele 2.
    //  Daca acesta este divizibil cu catul lor sa se afiseze numarul.
    //  Daca nu sa se afiseze un mesaj corespunzator.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();
        do
        {
            if (numar1 > numar2)
            {
                System.out.println("Cel mai mare numar este primul numar: " + numar1);
                if (numar1 % (numar1 / numar2) == 0)
                {
                    System.out.println("Rezultatul este divizibil: ");
                } else
                {
                    System.out.println("Rezultatul nu este divizibil:");
                }
            } else if (numar1 < numar2)
            {
                System.out.println("Cel mai mare numar este al doilea numar: " + numar2);
                if (numar2 % (numar2 / numar1) == 0)
                {
                    System.out.println("Rezultatul este divizibil: ");
                } else
                {
                    System.out.println("Rezultatul nu este divizibil:");
                }
            } else
            {
                System.out.println("Numerele sunt egale. ");
            }

            System.out.print("Introduceti alt numar: " + "sau apasati o daca doriti sa iesiti!: ");
            numar1 = scanner.nextInt();
            if (numar1 != 0)
            {
                System.out.print("Introduceti alt numar: " + "sau apasati o daca doriti sa iesiti!: ");
                numar2 = scanner.nextInt();
            }

        } while (numar1 != 0);
    }
}
