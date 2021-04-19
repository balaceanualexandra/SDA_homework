package com.sda.balaceanuale.homework.week2.operatii;

public class Exercise13

{
    //Exercitiul13:
    //Sa se scrie un exercitiu care inverseaza un numar de 3 cifre:
    //Ex: nr = 123 => 321;
    public static void main(String[] args)
    {

        int numar1 = 123;
        System.out.println("Numar initial: " + numar1);
        int oglindit = 0;
        while (numar1 > 0)
        {
            int numar = numar1 % 10;
            oglindit = oglindit * 10 + numar;
            numar1 = numar1 / 10;
        }
        System.out.println("Numar oglindit: " + oglindit);

        //exemplu detaliat pentru oglindire
        int numarInitial = 123456789;
        System.out.println("Numar initial: " + numarInitial);

        int numarOglindit = 0;

        while (numarInitial > 0)
        {
            System.out.println("Numarul initial este acum:" + numarInitial);

            int cifra = numarInitial % 10;

            System.out.println("Cifra este acum:" + cifra);

            numarOglindit = numarOglindit * 10 + cifra;

            System.out.println("Numarul oglindit este acum:" + numarOglindit);

            numarInitial = numarInitial / 10;
        }
        System.out.println("Numar oglindit: " + numarOglindit);


    }
}