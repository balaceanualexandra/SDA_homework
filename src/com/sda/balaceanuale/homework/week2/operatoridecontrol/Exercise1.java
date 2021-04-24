package com.sda.balaceanuale.homework.week2.operatoridecontrol;

import java.util.Scanner;

public class Exercise1
{
    //  Exercitiul1:
    //      Sa se citeasca de la tastatura 2 numere.
    //      Sa se afiseze suma lor daca numerele sunt pare.
    //      Sa se afiseze produsul lor daca numerele sunt impare.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti  primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();
        int sum = (numar1 + numar2);

        if (sum % 2 == 0)
        {
            System.out.println("Suma numerelor introduse este para: " + sum);
        } else
        {
            System.out.println("Suma numerelor introduse este impara:  " + sum);
            int product = (numar1 * numar2);
            System.out.println("Produsul numerelor impare este: " + product);
        }
    }
}
