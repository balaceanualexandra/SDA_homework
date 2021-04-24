package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise4
{
    //Exercitiul4:
    //  Sa se citeasca 2 numere de la tastatura.
    //  Sa se verifice daca produseul numerelor este divizibil cu 3.
    //  Sa se verifice daca produsul lor este divizibil cu 5.
    //  Sa se verifice daca produsul lor este divizibil cu 3 si 5.
    //  Sa se afiseze mesaje corespunzatoare.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();

        int product = numar1 * numar2;
        if (product % 3 == 0 && product % 5 == 0)
        {
            System.out.println("Produsul numerelor este divizibil cu 3 si 5: " + (product % 3 == 0) + " Produsul numerelor este :" + product);
        } else if (product % 3 == 0)
        {
            System.out.println("Produsul numerelor este divizibil cu 3: " + (product % 3 == 0) + " Produsul numerelor este :" + product);
        } else if (product % 5 == 0)
        {
            System.out.println("Produsul numerelor este divizibil cu 5: " + (product % 5 == 0) + " Produsul numerelor este :" + product);
        } else
        {
            System.out.println("Produsul numerelor nu este divizibil cu 3 sau 5. ");
        }
    }
}
