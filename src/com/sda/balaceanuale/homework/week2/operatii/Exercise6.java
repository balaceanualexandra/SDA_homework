package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise6
{
    //Exercitiul 6:
    //Sa se scrie un program ce citeste de la tastatura 2 numere, unul reprezentand inaltimea unui dreptunghi iar celalalt latimea acestuia.
    //Sa se calculeze si afiseze perimetrul si aria acestui dreptunghi.

    public static void main(String[] args)
    {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduceti inaltimea: ");
        int width = scaner.nextInt();
        System.out.println("Introduceti latimea: ");
        int lenght = scaner.nextInt();

        int perimeter = 2 * width + 2 * lenght;
        System.out.println("Rezultatul perimetrului: " + perimeter);

        int aria = width * lenght;
        System.out.println("Rezultatul ariei: " + aria);


    }
}