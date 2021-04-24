package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise7
{
    // Exercitiul7:
    //  Sa se scrie un program care ne saluta in felul urmator:
    //  Sa se citeasca de la tastatura un numar.
    //  Daca numarul este mai mic sau egal cu 11 sa ne spuna "buna dimineata".
    //  Daca numarul este mai mare ca 11 sa ne spuna "buna ziua".
    //  Daca numarul este mai mare ca 18 sa ne spuna "buna seara.
    //  Daca numarul este mai mare ca 22 dar mai mic ca 24 sa ne trimita la somn.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intoduceti numarul: ");
        int ora = scanner.nextInt();

        do
        {
            if (ora <= 11)
            {
                System.out.println("Buna dimineata! " + ora + " ");
            } else if ((ora > 11) && (ora < 18))
            {
                System.out.println("Buna ziua!: " + ora + " ");
            } else if ((ora > 18) && (ora < 22))
            {
                System.out.println("Buna seara!: " + ora + " ");
            } else if ((ora >= 22) && (ora < 24))
            {
                System.out.println("Treci la somn:");
            } else
            {
                System.out.println("Ora introdusa nu este acceptata!");
            }

            System.out.println("Introduceti o noua ora: " + "Introducetti o alta ora sau 0 , daca doriti sa iesiti. ");
            ora = scanner.nextInt();
        }
        while (ora != 0);
    }
}
