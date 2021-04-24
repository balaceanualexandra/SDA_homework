package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise3
{
    //Exercitiu3:
    //      Sa se citeasca de la tastatura 2 Stringuri.
    //      Daca acestea sunt diferite sa se afiseze concatenarea lor.
    //      Daca sunt identice sa se afiseze ca ambele stringuri sunt identice.
    //      Stringurile se compara in felul urmator: stringVar1.equals(stringVar2);
    //      pentru a compara strict continutul lor.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inroduceti primul string:");
        String string1 = scanner.nextLine();
        System.out.print("Inroduceti al doilea string:");
        String string2 = scanner.nextLine();

        if (string1.equals(string2))
        {
            System.out.println("Stringurile sunt identice: " + string1);
        } else
        {
            System.out.println("Stringurile sunt diferite: ");
            System.out.println("Stringurile concatenate: " + string1.concat(string2));
            // System.out.println("Stringurile concatenate: " +string1+string2 );
        }
    }
}
