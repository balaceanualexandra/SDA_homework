package com.sda.balaceanuale.homework.week2.icrementaredecrementare;

import java.util.Scanner;

public class Exercise7
{
    //Exercitiul7:
    //Sa se citeasca un numar de la tastatura si sa se utilizeze in urmatoarea expresie:
    //--nrCititDeLaTastatura + 2 * nrCititDeLaTastatura-- + nrCititDeLaTastatura++;
    //Sa se afiseze rezultatul expresiei si valoarea nrCititDeLaTastatura dupa terminarea ei.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int nrCititDeLaTastatura = scanner.nextInt();
        int result = --nrCititDeLaTastatura + 2 * nrCititDeLaTastatura-- + nrCititDeLaTastatura++;
        System.out.println("Rezultat expresie:" + result);
        System.out.println("Numarul citit de la tastatura dupa terminarea expresiei: " + nrCititDeLaTastatura);
    }
}