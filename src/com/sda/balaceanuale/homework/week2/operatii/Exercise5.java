package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise5
{

    public static void main(String[] args)
    {
       //Exercitiu 5:
        //Sa se scrie un program ce citeaste 3 variabile de tip text de la tastatura ("Buna", "ziua", "numePersoana"(ex Marian)) si sa se afiseze pe ecran urmatoarele texte:
        //Buna Ziua,
        //numePersoana
        //
        //numePersoana, Buna Ziua!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String text1 = scanner.nextLine();
        System.out.println("Introduceti cuvantul: ");
        String text2 = scanner.nextLine();
        System.out.println("Introduceti cuvantul: ");
        String text3 = scanner.nextLine();

        System.out.println(text1 + " " + text2 + ",");
        System.out.println(text3);
        System.out.println(text1 + " " + text2 + "," + text3 + "!");
    }
}