package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise3
{
    //Exercitiu3:
    //Sa se scrie un program ce citeste de la tastatura un numar si il afiseaza.
    //Sa se salveze intr-o variabila rezultatul aceste expresii si sa se afiseze pe ecran rezultatul si valoarea nrCititDeLaTastatura dupa terminarea expresiei:
    //--nrCititDeLaTastatura + -(2 * (1 + nrCititDeLaTastatura)) + ++nrCititDeLaTastatura;
    //Sa se discute rezultatul expresiei.


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int nrCititDeLaTastatura = scanner.nextInt();

        int result = --nrCititDeLaTastatura + -(2 * (1 + nrCititDeLaTastatura)) + ++nrCititDeLaTastatura;
        System.out.println("Rezultatul: " + result);
        System.out.println("Numar citit de la tastatura: " +nrCititDeLaTastatura );
        // 4 + -(2*5)+5=4-10+5=-1 (numarul initial introdus la tastatura este 5;




    }
}