package com.sda.balaceanuale.homework.week2.icrementaredecrementare;

import java.util.Scanner;

public class Exercise9
{
    //Exercitiul9:
    //Sa se citeasca doua numere de la tastatura si sa se utilizeze in urmatoarea expresie:
    //nr1++ - 2 * (1 + --nr2) + 5/nr2++ - 10%5 - ++nr1 + nr1++ - --nr1;
    //Sa se afiseze rezultatul expresiei si valoarea nrCititDeLaTastatura dupa terminarea ei.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int nr1 = scanner.nextInt();
        System.out.print("Introduceti al doliea numar: ");
        int nr2 = scanner.nextInt();
        int result = nr1++ - 2 * (1 + --nr2) + 5/nr2++ - 10%5 - ++nr1 + nr1++ - --nr1;
        System.out.println("Rezultat expresie:" + result);
        System.out.println("Numarul unu de la tastatura dupa terminarea expresiei: "+nr1 );
        System.out.println("Numarul doi de la tastatura dupa terminarea expresiei: " +nr2);
    }
}