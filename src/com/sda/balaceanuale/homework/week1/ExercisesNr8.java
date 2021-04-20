package com.sda.balaceanuale.homework.week1;

import java.util.Scanner;

public class ExercisesNr8
{

    //8.Hint: se vor face interschimbari intre tipul intreg si tipul cu zecimale si invers.
    // Mare grija la conversii.
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
    //
    //A se observa ca atunci cand folosim castarea(conversia) se pierd zecimalele
    // daca venim din tipul cu zecimale in tipul intreg.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti un numar cu zecimale:");
        double a = scanner.nextDouble();
        System.out.println("a = " + a);
        System.out.println("introduceti al doilea numar cu zecimale:");
        double b = scanner.nextDouble();
        System.out.println("b = " + b);
        System.out.println("introduceti un numar intreg:");
        int c = scanner.nextInt();
        System.out.println("c = " + c);
        System.out.println("introduceti al doilea numar intreg:");
        int d = scanner.nextInt();
        System.out.println("d = " + d);

        System.out.println("-----------------");
        System.out.println("Valori initiale pereche 1-3:");
        System.out.println("Valoare numar1 =" + a);
        System.out.println("Valoare numar3 =" + c);
        double e = a;
        a = c;
        c = (int) e;
        System.out.println("Valori dupa interschimbare pereche 1-3:");
        System.out.println("Valoare numar1 =" + a);
        System.out.println("Valoare numar3 =" + c);

        System.out.println("-----------------");
        System.out.println("Valori initiale pereche 2-4:");
        System.out.println("Valoare numar1 =" + b);
        System.out.println("Valoare numar3 =" + d);
        double f = b;
        b = d;
        d = (int) f;
        System.out.println("Valori dupa interschimbare pereche 2-4:");
        System.out.println("Valoare numar1 =" + b);
        System.out.println("Valoare numar3 =" + d);
    }
}

