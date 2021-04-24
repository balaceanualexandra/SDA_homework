package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise11
{
    //Exercitiul11:
    //  Sa se scrie un program care citeste 3 numere de la tastatura.
    //  Sa se verifice daca suma acestor numere este divizibila cu un al patrulea numar citit de la tastatura.
    //  Daca respecta conditia atunci sa se verifice daca al patrulea numar citit de la tastatura
    //  este si el la randul sau divizibul cu fiecare numar in parte.
    //  Sa se afiseze mesaje corespunzatoare.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul : ");
        int number1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int number2 = scanner.nextInt();
        System.out.print("Introduceti al treilea numar: ");
        int number3 = scanner.nextInt();
        System.out.print("Introduceti al patrulea numar: ");
        int number4 = scanner.nextInt();
        int sum = number1 + number2 + number3;

        if (sum % number4 == 0)
        {
            System.out.println("Suma numerelor este divizibila cu al patrulea numar.");
            if (number4 % number1 == 0)
            {
                System.out.println("Al patrulea numar este divizibil cu primul numar.");
            }
            if (number4 % number2 == 0)
            {
                System.out.println("Al patrulea numar este divizibil cu al doilea numar.");
            }
            if (number4 % number3 == 0)
            {
                System.out.println("Al patrulea numar este divizibil cu al treilea numar.");
            }
        } else
        {
            System.out.println("Suma nu esre divizibila.");
        }
    }
}

