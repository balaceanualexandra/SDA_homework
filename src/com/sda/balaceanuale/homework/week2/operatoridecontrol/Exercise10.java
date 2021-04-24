package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise10
{
    //Exercitiul10:
    //  Sa se scrie un program ce citeste 1 numar de la tastatura.
    //  Daca acest numar este divizibil cu 2 atunci sa se imparta numarul la 2 si sa se afiseze rezultatul.
    //  Daca acest numar este divizibil cu 2 si cu 3 sa se faca suma numarului cu multiplii sai cu 2 si 3 si
    //   sa se afiseze suma.
    //  Daca aest numar nu este divizibil nici cu 2 si nici cu 3 sa se afiseze un mesaj corespunzator.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul : ");
        int number1 = scanner.nextInt();
        if (number1 % 2 == 0 && number1 % 3 == 0)
        {
            int sum = number1 + number1 * 2 + number1 * 3;
            System.out.println("Suma multiplilor este: " + sum);
        } else if (number1 % 2 == 0)
        {
            System.out.println("Numarul este dizibil cu doi.");
            int result = number1 / 2;
            System.out.println("Rezultatul numarului impartit la 2 este :" + result);

        } else
        {
            System.out.println("Numarul nu este divizibil cu 2 sau 3.");
        }
    }
}


