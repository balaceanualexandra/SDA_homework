package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise8
{
    //Exercitiul 8: Hint: se vor face interschimbari intre tipul intreg si tipul cu zecimale
    // si invers.Mare grija la conversii.
    //Sa se scrie un program care citeste 2 numere intregi si 2 numere cu zecimale de la tastatura.
    //Interschimba valorile numarului1 cu numarul3 si valorile numarului2 cu numarul4.
    //Sa se afiseze pe ecran valorile perechilor initiale si apoi dupa interschimbare.
    //Ex: Valori initiale pereche 1-3:
    //    Valoare numar1 = valoare;
    //    Valoare numar3 = valoare;
    //
    //Valori dupa interschimbare pereche 1-3:
    //    Valoare numar1 = valoare;
    //    Valoare numar3 = valoare;
    //
    //System.out.println("---------------------");
    //
    //asemenea si pentru perechea 2-4.

    public static void main(String[] args)

    {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
       int varInt1 = scanner.nextInt();
        System.out.println("Primul numar introdus este:" +varInt1);
        System.out.println("Introduceti al doilea numar: ");
        int varInt2 = scanner.nextInt();
        System.out.println("Al doilea numar introdus este: " + varInt2);
        System.out.println("Introduceti primul numar cu zecimale:");
        double doubleVar1 = scanner.nextDouble();
        System.out.println("Primul numar cu zecimale introdus este:" + doubleVar1);
        System.out.println("Introduceti al dilea numar cu zecimale: ");
        double doubleVar2 = scanner.nextDouble();
        System.out.println("Al doliea numar cu zecimale introdus este: " +doubleVar2);


        System.out.println("-----------------");
        System.out.println("Valori initiale pereche 1-3:");
        System.out.println("Valoare numar1 =" + varInt1);
        System.out.println("Valoare numar3 =" + doubleVar1);
        double numarInterschimbat1 = varInt1;
        varInt1 = (int) doubleVar1;
        doubleVar1 = (int) numarInterschimbat1;
        System.out.println("Valori dupa interschimbare pereche 1-3:");
        System.out.println("Valoare numar1 =" + varInt1);
        System.out.println("Valoare numar3 =" + doubleVar1);

        System.out.println("-----------------");
        System.out.println("Valori initiale pereche 2-4:");
        System.out.println("Valoare numar1 =" + varInt2);
        System.out.println("Valoare numar3 =" + doubleVar2);
        double numarInterschimbat2 = varInt2;
        varInt2 = (int) doubleVar2;
        doubleVar2 = (int) numarInterschimbat2;
        System.out.println("Valori dupa interschimbare pereche 2-4:");
        System.out.println("Valoare numar1 =" + varInt2);
        System.out.println("Valoare numar3 =" + doubleVar2);

    }
}