package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Exercise4
{
    //  Exercitiul 4:
    //      Scrieti un program care roaga utilizatorul sa introduca numere de la tastatura
    //      pana la introducerea unui numar de doua cifre.
    //      Sa se calculeze si sa se afiseze produsul numerelor impare divizibile cu 3;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int number = scanner.nextInt();
        int product =1;

        while (number <= 9)
        {
            System.out.println("Introduceti urmatorul numar: ");
            number = scanner.nextInt();
            if (number > 9)
            {
                System.out.println("Programul se opreste , numarul este din doua cifre.");
            }
            else {
                if (number % 2 ==1 && number % 3==0)
                {
                  product = product * number;

                }
            }
        }
        System.out.println("Produsul numerelor impare divizibile cu 3: " + product);

        /*Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number < 9)
        {
            System.out.println("Introduceti numarul: ");
            number = scanner.nextInt();
            if (number >9)
            {
                System.out.println("Programul se opreste , numarul este din doua cifre.");
            }
        }*/
    }
}


