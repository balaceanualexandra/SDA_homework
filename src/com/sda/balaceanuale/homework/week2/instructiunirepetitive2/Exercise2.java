package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;

import java.util.Scanner;

public class Exercise2
{
    //  Exercitiul2:
    //      Scrieti un program care citeaste 2 numere de la tastatura.
    //      Sa se faca produsul numerelor si sa se salveze intr-o variabila.
    //      Daca produsul numerelor este par sa se afiseze toate numerele
    //      divizibile cu 2 mai mici ca acel produs.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int number1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int number2 = scanner.nextInt();
        int productNumber = number1 * number2;

        if (productNumber % 2 == 0)
        {
            int curentNumber = productNumber;
            while (curentNumber > 0)
            {
                if (curentNumber % 2 == 0)
                {
                    System.out.println("Numere divizibile cu 2, " + curentNumber + " mai mici decat: " + productNumber + " produsul celor doua numere.");

                    System.out.println("Produsul numerelor nu este divizibil: ");
                }
                curentNumber--;
            }
        } else
        {
            System.out.println("Numarul nu este divizibil!");
        }
    }


}

