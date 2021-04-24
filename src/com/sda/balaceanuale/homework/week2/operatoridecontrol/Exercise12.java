package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise12
{
    //Exercitiul 12:
    //  Sa se scrie un program ce roaga utilizatorul sa introduca 2 Stringuri.
    //  Daca aceste Stringuri sunt identice sa se roage utilizatorul sa introduca 2 numere intregi de la tastatura,
    //  daca Stringurile nu sunt identice sa se afiseze un mesaj corespunzator si sa se incheie programul.
    //	Sa se verifice daca
    // 	    - primul numar este par si daca este sa se afiseze un mesaj corespunzator.
    //      - al doilea numar este impar si daca este sa se afiseze un mesaj corespunzator.
    //	    - daca ambele numere sunt pare si suma lor
    //		  este mai mare sau egala cu un al treilea numar citit de la tastatura,
    //		  sa se afiseze: "Suma numerelor " + nr1 + " + " nr2 + este mai mare sau egala ca " + nr3;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti un text: ");
        String text1= scanner.nextLine();
        System.out.println("Va rugam introduceti un text:");
        String text2 = scanner.nextLine();
        if (text1.equals(text2))
        {
            System.out.print("Introduceti doua numere de la tastatura: " + "Introduceti primul numar: " );
            int number1 = scanner.nextInt();
            System.out.print("Introduceti al doilea numar: " );
            int number2 = scanner.nextInt();
            if (number1 % 2 ==0)
            {
                System.out.println("Numarul este par.");
            }
            if (number2 % 2 ==1)
            {
                System.out.println("Numarul este impar.");
            }
            System.out.println("Introduceti al treilea numar: ");
            int number3 = scanner.nextInt();
            if (number1 % 2 ==0 && number2 %2 ==0 && (number1 + number2) >= number3)
            {
                System.out.println("Suma numerelor " + number1 + " + " + number2 + "este mai mare sau egala ca " + number3);
            }
            else
            {
                System.out.println("Conditia nu a fost adevarata!");
            }
        }
        else
        {
            System.out.println("Textele nu sunt identice! ");
        }
    }
}

