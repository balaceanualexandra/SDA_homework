package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;


import java.util.Scanner;

public class Exercise5
{
    //  Exercitiul5:
    //      Scrieti un program care cere utilizatorului
    //      sa introduca numere de la tastatura pana la introducerea unui numar de 3 cifre.
    //      Sa se afiseze suma numerelor pare de doua cifre.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number <= 99)
        {
            if (number % 2 == 0 && number > 9)
            {
                sum = sum + number;
                System.out.println("Suma numerelor pare de doua cifre: " + sum);
            }

            System.out.print("Introduceti urmatorul numar: ");
            number = scanner.nextInt();

            if (number > 99)
            {
                System.out.println("Programul se opreste , numarul este cu trei sau mai multe cifre.");
            }
        }
    }


}


