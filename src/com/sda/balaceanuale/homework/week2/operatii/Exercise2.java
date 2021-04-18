package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise2
{
    //Exercitiu2:
    //Sa se scrie un program ce citeste de la tastatura un numar si il afiseaza.
    //Sa se salveze intr-o variabila rezultatul acestei expresii si sa se afiseze pe ecran rezultatul ei si valoarea nrCititDeLaTastatura dupa terminarea expresiei:
    //nrCititDeLaTastatura * (2 + ++nrCititDeLaTastatura) - nrCititDeLaTastatura++;  // hint: operaturii ++ si -- au cea mai mare prioritate.
    //Sa se discute rezultatul expresiei.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul:" );
        int nrCititDeLaTastatura = scanner.nextInt();
        System.out.println("Afisati numarul: " +nrCititDeLaTastatura);
        System.out.println("Numar citit de la tastatura: " +nrCititDeLaTastatura );

        int result = nrCititDeLaTastatura * (2 + ++nrCititDeLaTastatura) - nrCititDeLaTastatura++;
        System.out.println("Rezultat: " +result);
        System.out.println("Numar citit de la tastatura dupa evaluare: " +nrCititDeLaTastatura );


        // 5* (2+6) -6= 5*8-6= 34;(numarul introdus a fost 5)


    }
}