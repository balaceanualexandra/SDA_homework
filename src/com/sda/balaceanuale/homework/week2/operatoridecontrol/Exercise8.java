package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise8
{
    //Exercitiul8:
    //  Sa se scrie un program care ii cere utilizatorului sa isi introduce varsta.
    //  Daca acesta este un numar sub 18 sa se afiseze un mesaj corespunzator.
    //  Daca acesta este un numar egal cu 18 sa afiseze un mesaj corespunzator.
    //  Daca acesta este un numar mai mare ca 18 dar mai mic ca 25 sa afiseze un mesaj corespunzator.
    //  Daca acesta este un numar mai mare ca 25 dar mai mic sau egal ca 40 sa ii afiseze un mesaj corespunzator.
    //  Daca acesta este un numar mai mare ca 40 dar mai mic de 65 sa ii afiseze un mesaj corespunzator.
    //  Daca acesta este un numar mai mare ca 65 sau egal cu 65 sa ii afiseze un mesaj corespunzator.
    //  Fiecare afiseaza ce mesaj doreste pentru intervalele de varsta.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intoduceti varsta: ");
        int varsta = scanner.nextInt();
        do
        {
            if (varsta < 18)
            {
                System.out.println("Buna , ai rabdare, o sa cresti! ");

            } else if (varsta == 18)
            {
                System.out.println("Buna, acum  esti adult! ");
            } else if ((varsta > 18) && (varsta < 25))
            {
                System.out.println("Buna tinere!");
            } else if ((varsta > 25) && (varsta < 40))
            {
                System.out.println("Buna , om in puterea varstei! ");
            } else if ((varsta > 40) && (varsta < 65))
            {
                System.out.println("Buna , in curand o sa ai nepoti! ");
            } else if (varsta >= 65)
            {
                System.out.println("Buna , bunicule! ");
            } else
            {
                System.out.println("Varsta introdusa nu este acceptata! ");
            }
            System.out.println("Introduceti o alta varsta sau apasati -1, daca doriti sa iesiti!");
            varsta = scanner.nextInt();
        }
        while (varsta != -1);
    }
}
