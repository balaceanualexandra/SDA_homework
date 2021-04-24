package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;

import java.util.Scanner;

public class Exercise3
{
    //  Exercitiul3:
    //      Scrieti un program care cere utilizatorului sa introduca numere de la tastatura
    //      pana la introducerea numarului 0.
    //      Sa se calculeze si afiseze suma numerlor mai mari ca 5.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int number1 = scanner.nextInt();
        int sum = 0;

        while (number1 != 0)
        {
            if (number1 > 5)
            {
                sum = sum + number1;
                System.out.println("Suma numerelor mai mari decat 5 este: " + sum);
            }
            System.out.print("Introduceti un nou numar: ");
            number1 = scanner.nextInt();
        }
        System.out.println("Ai introdus cifra 0, programul se incheie.");
    }
}

