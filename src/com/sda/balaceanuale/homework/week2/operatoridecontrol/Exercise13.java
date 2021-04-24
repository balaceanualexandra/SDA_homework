package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise13
{
    //Exercitiul13:
    //  Sa se scrie un program care verifica daca un caracter introdus de la tastatura este cifra,
    //  litera sau caracter special si sa se afiseze un mesaj corespunzator pentru fiecare caz.
    //  Hint: Scanner numeVariabilaScanner = new Scanner(System.in);
    //      Scanner NU ofera un numeVariabilaScanner.nextChar(). O metoda pentru citirea unui singur
    //      caracter de la tastatura.
    //      Sa se foloseasca urmatoarea sintaxa:
    //      String stringVar = numeVariabilaScanner.nextLine();
    //      char charVar = stringVar.charAt(0); //asa se ia prima litera dintr-un String. Vom discuta la partea de OOP cand vom face Stringurile mai in amanunt.
    //      Acest charVar sa se verifice daca este litera cifra sau caracter special.
    //      HINT: cifra - charVar >= '0' && charVar <= '10'
    //            litera - (charVar >= 'a' && charVar <= 'z') ||  (charVar >= 'A' && charVar =< 'Z')
    //			  caracter special - diferit de cele doua conditii ;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un caracter: ");
        String text = scanner.nextLine();
        char charVar = text.charAt(0);
        if (charVar >= '0' && charVar <= '9')
        {
            System.out.println("Ai introdus o cifra! ");
        }
        else if ((charVar >= 'a' && charVar <= 'z') ||  (charVar >= 'A' && charVar <= 'Z'))
        {
            System.out.println("Ai introdus o litera.");
        }
        else
        {
            System.out.println("Ai introdus un caracter special! ");
        }
    }
}

