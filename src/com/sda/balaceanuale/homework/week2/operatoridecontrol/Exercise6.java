package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise6
{
    //Exercitiu6:
    //  Sa se scrie un program ce citeste de la tastatura un numar.
    //  Sa se verifice daca numarul introdus este pozitiv, negativ sau este 0;
    //  Sa se afiseze mesaje corespunzatoare.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intoduceti numarul: ");
        int numar = scanner.nextInt();

        if (numar < 0)
        {
            System.out.println("Numarul este negativ: " + numar + " ");
        } else if (numar > 0)
        {
            System.out.println("Numarul este pozitiv: " + numar + " ");
        } else
        {
            System.out.println("Numarul este zero:" + numar + " " + (numar == 0));
        }
    }
}
