package com.sda.balaceanuale.homework.week2.icrementaredecrementare;

import java.util.Scanner;

public class Exercise10
{
    //Exercitiul10:
    //Sa se citeasca doua numere de la tastatura.
    //Sa se incrementeze valoarea primului numar si sa se decrementeze valoarea celui de-al doilea.
    //Sa se verifice daca suma numerelor(inainte sa se modifice valorile) este divizibila cu 2.
    // Daca este sa se afiseze: "Suma numerelor nr1 + nr2 inainte sa fie modificate este suma si este divizibila cu 2".
    //Daca nu este divizibila cu 2 sa se afiseze un mesaj corespunzator.
    //Sa se verifice din nou daca suma celor doua numere
    // (dupa ce s-au modificat valorile celor doua numere prin incrementare si decrementare)
    // daca este numar impar. Daca suma rezultata este numar impar sa se afiseze un mesaj corespunzator.
    //Daca nu este numar impar sa se afiseze ca suma numerelor dupa modificare nu este numar impar.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int nr1 = scanner.nextInt();
        System.out.print("Introduceti al doliea numar: ");
        int nr2 = scanner.nextInt();

        int sum = nr1 + nr2;
        if (sum % 2 == 0)
        {
            System.out.println("Suma numerelor nr1 + nr2 inainte sa fie modificate este " + sum + " si este divizibila cu 2: ");
        } else
        {
            System.out.println("Suma numerelor este: " + sum + " Suma numerelor nu este divizibila cu 2");
        }

        nr1++;
        System.out.println("Rezultat primul numar incrementat: " + nr1);
        //nr1 = nr1 + 1;
        nr2--;
        System.out.println("Rezultat al doilea numar decrementat:" + nr2);
        //nr2 = nr2 -1;

        int sum2 = nr1 + nr2;
        if (sum2 % 2 == 1)
        {
            System.out.println("Suma numerelor dupa modificari: " + sum + " ,suma numerelor este impara.");
        } else
        {
            System.out.println("Suma numerelor dupa modificari: " + sum + " Suma numerelor este para.");
        }
    }
}