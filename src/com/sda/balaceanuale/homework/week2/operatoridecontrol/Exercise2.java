package com.sda.balaceanuale.homework.week2.operatoridecontrol;

import java.util.Scanner;

public class Exercise2
{
    //  Exercitiu2:
    //      Sa se citeasca un numar de la tastatura si sa se verifice daca este multiplu de 2,
    //      daca este multiplu de 4 sau daca este multiplu de 2 si 4
    //      si sa se afiseze mesaje corespunzatoare pentru fiecare caz.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numar1 = scanner.nextInt();

        if (numar1 % 2 == 0 && numar1 % 4 == 0)
        {
            System.out.println("Numarul introdus este multiplu de doi si de patru");

        } else if (numar1 % 4 == 0)
        {
            System.out.println("Numarul introdus este multiplu de patru");
        } else if (numar1 % 2 == 0)
        {
            System.out.println("Numarul introdus este multiplu de doi");

        } else
        {
            System.out.println("Numarul nu sete multiplu nici de doi nici de patru: ");
        }
    }
}
