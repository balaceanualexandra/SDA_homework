package com.sda.balaceanuale.curs.week3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//Se vor citi 4 numere de la tastatura
//7.Afisaza suma dintre produsul numerelor de o cifra si produsul numerelor de 2.

        Scanner scanNr = new Scanner(System.in);
        int nr1, nr2, nr3, nr4;
        System.out.print("introdu nr1: ");
        nr1 = scanNr.nextInt();
        System.out.print("introdu nr2: ");
        nr2 = scanNr.nextInt();
        System.out.print("introdu nr3: ");
        nr3 = scanNr.nextInt();
        System.out.print("introdu nr4: ");
        nr4 = scanNr.nextInt();
        int produs1Cifra = 1;
        int produs2Cifre = 1;
        int suma = 0;
        if (nr1 < 10) {
            produs1Cifra = produs1Cifra * nr1;
        } else if (nr1 < 100) {
            produs2Cifre = produs2Cifre * nr1;
        }
        if (nr2 < 10) {
            produs1Cifra = produs1Cifra * nr2;
        } else if (nr2 < 100) {
            produs2Cifre = produs2Cifre * nr2;
        }
        if (nr3 < 10) {
            produs1Cifra = produs1Cifra * nr3;
        } else if (nr3 < 100) {
            produs2Cifre = produs2Cifre * nr3;
        }
        if (nr4 < 10) {
            produs1Cifra = produs1Cifra * nr4;
        } else if (nr4 < 100) {
            produs2Cifre = produs2Cifre * nr4;
        }
        suma = produs1Cifra + produs2Cifre;
        if (suma == 2) {
            System.out.println("nu au existat numere de o cifra sau 2 cifre");
        } else {
            System.out.println("suma =" + suma);
        }
        suma = 0;
        produs1Cifra = 1;
        produs2Cifre = 1;
        int n;
        do {
            System.out.println("introdu un numar de la tastatura:");
            n = scanNr.nextInt();
            if (n != 0 && n < 10) {
                produs1Cifra = produs1Cifra * n;
            } else if (n != 0 && n < 100) {
                produs2Cifre = produs2Cifre * n;
            }
        } while (n != 0);
        suma = produs1Cifra + produs2Cifre;
        System.out.println("suma " + suma);
    }
}
