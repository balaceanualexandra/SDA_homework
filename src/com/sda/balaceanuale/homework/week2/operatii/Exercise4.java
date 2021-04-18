package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise4
{
    //Exercitiul 4. Scrieti un program ce afiseaza rezultatul urmatoarelor expresii in felul urmator:
    //Rezultatul expresiei -5 + 8 * 6 este: 43
    //Rezultatul expresiei (-5 + 8) * 6 este: 18
    //Rezultatul expresiei 9 / 3 + 2 * 6 este: 15
    //Rezultatul expresiei 9 / (3 + 2) * 6 este: 6
    //Rezultatul expresiei 9 % 3 + 2 * 6 este: 12
    //Hint: Operatorii * / % se executa inaintea operatorilor + -
    //Daca intr-o expresie operatorii au aceeasi ordine de executare atunci expresia se evalueaza de la stanga la dreapta.
    //() suprascriu ordinea de executare.
    //
    //Sa se analizeze in echipa cum s-a ajuns la aceste rezultate si diferenta dintre cele asemanatoare.
    public static void main(String[] args)
    {
        int var1 = -5 + 8 * 6;
        System.out.println("Rezultatul expresiei -5 + 8 * 6 este:" + var1);
        int var2 = (-5 + 8) * 6;
        System.out.println("Rezultatul expresiei (-5 + 8) * 6 este: " + var2);
        int var3 = 9 / 3 + 2 * 6;
        System.out.println("Rezultatul expresiei 9 / 3 + 2 * 6 * 6 este:" + var3);
        int var4 = 9 / (3 + 2) * 6;
        System.out.println("Rezultatul expresiei 9 / (3 + 2) * 6 este:" + var4);
        int var5 = 9 % 3 + 2 * 6;
        System.out.println("Rezultatul expresiei 9 % 3 + 2 * 6 este: " + var5);

        //Operatorii * / % se executa inaintea operatorilor + -
    }
}