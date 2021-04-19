package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise12

{
    //Execrcitiul 12:
    //Sa se scrie un exercitiu care aduna ultima cifra a doua numere de tip int si o afiseaza pe ecran.
    public static void main(String[] args)
    {
        int numar1 = 15;
        int numar2 = 51;
        System.out.println("Suma ultimei cifre este: " + (numar1 % 10  +numar2 % 10));
    }
}