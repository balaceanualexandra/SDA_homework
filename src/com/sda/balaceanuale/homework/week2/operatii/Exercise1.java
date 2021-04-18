package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise1
{
    //Exercitiul1:
    //Sa se scrie un program care citeste 2 numere de la tastatura si afiseaza suma lor, inmultirea lor, impartirea lor, si catul acestor numere.
    //Dupa ce se face suma numerelor, se salveaza intr-o variabila.
    //Sa se aplice operatorul % intre suma numerelor si fiecare numar citit de la tastatura si sa se afiseze rezultatul pe ecran.
    //					Exemplu suma % nr1
    //						suma % nr2
    public static void main(String[] args)
    {
        Scanner scannerNumbers = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        int varInt1 = scannerNumbers.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int varInt2 = scannerNumbers.nextInt();

        int sum = varInt1 + varInt2;
        System.out.println("Suma numerelor: " + sum);

        int multiplication = varInt1 * varInt2;
        System.out.println("Produsul numerelor este: " + multiplication);

        int divide = varInt1 / varInt2;
        System.out.println(" Rezultatul impartirii este: " + divide);

        int rest = varInt1 % varInt2;
        System.out.println("Restul impartirii: " + rest);

        int rest1 = sum % varInt1;
        int rest2 = sum % varInt2;
        System.out.println("Rezultat suma % nr1: " + rest1);
        System.out.println("Rezultat suma % nr2: " + rest2);
    }
}
