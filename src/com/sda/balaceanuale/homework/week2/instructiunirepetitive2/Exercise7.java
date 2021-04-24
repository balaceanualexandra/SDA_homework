package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;


import java.time.Month;
import java.util.Scanner;

public class Exercise7
{
    //  Scrieti un program care ne afiseaza numarul de zile dintr-o luna a unui an.
    //  Luna si anul sunt citite de la tastatura.
    //  Sa se trateze si anii bisecti pentru luna februarie.
    //  Numarul lunilor incepe cu 1: 1-Ianuarie, 2-Februarie,etc...
    //  Sa se foloseasca instructiunea decizionala de control switch.
    //      Exemplu:
    //          User input:
    //              Input a month number: 2
    //              Input a year: 2016
    //          Java program output:
    //              February 2016 has 29 days.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti luna: ");
        int nameMonth = scanner.nextInt();
        System.out.print("Introducet anul: ");
        int numberYear = scanner.nextInt();

        switch (nameMonth)
        {
            case 1:
                System.out.println(Month.JANUARY + " " + numberYear + " are " + 31 + " de zile");
                break;
            case 2:
                if (numberYear % 4 == 0)
                {
                    System.err.println(Month.FEBRUARY + " " + numberYear + " are " + 29 + " de zile.");
                } else
                {
                    System.out.println(Month.FEBRUARY + " " + numberYear + " are " + 28 + " de zile.");
                }
                break;
            case 3:
                System.out.println(Month.MARCH + " " + numberYear + " are " + 31 + " de zile.");
                break;
            case 4:
                System.out.println(Month.APRIL + " " + numberYear + " are " + 30 + " de zile.");
                break;
            case 5:
                System.out.println(Month.MAY + " " + numberYear + " are " + 31 + " de zile.");
                break;
            case 6:
                System.out.println(Month.JUNE + " " + numberYear + " are " + 30 + " de zile.");
                break;
            case 7:
                System.out.println(Month.JULY + " " + numberYear + " are " + 31 + " de zile.");
                break;
            case 8:
                System.out.println(Month.AUGUST + " " + numberYear + " are " + 31 + " de zile.");
                break;
            case 9:
                System.out.println(Month.SEPTEMBER + " " + numberYear + " are " + 30 + " de zile.");
                break;
            case 10:
                System.out.println(Month.OCTOBER + " " + numberYear + " are " + 31 + " de zile.");
                break;
            case 11:
                System.out.println(Month.NOVEMBER + " " + numberYear + " are " + 30 + " de zile.");
                break;
            case 12:
                System.out.println(Month.DECEMBER + " " + numberYear + " are " + 31 + " de zile.");
                break;

            default:
                System.out.println("Luna introdusa nu este valida");
        }
    }
}


