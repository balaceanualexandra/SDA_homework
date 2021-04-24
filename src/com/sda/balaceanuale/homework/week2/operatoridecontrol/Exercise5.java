package com.sda.balaceanuale.homework.week2.operatoridecontrol;


import java.util.Scanner;

public class Exercise5
{
    //Exercitiul5:
    //  Sa se citeasca de la tastatura 2 Nume( scanner.nextLine()).
    //  Sa se afiseze concatenarea lor daca textele sune identice,
    //  daca nu sa se afiseze mesajul: "Numele sunt diferite".

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un primul nume: ");
        String nume1 = scanner.nextLine();
        System.out.println("Introduceti al doilea nume: ");
        String nume2 = scanner.nextLine();

        if (nume1.equalsIgnoreCase(nume2))
        {
            //System.out.println("Numele sunt identice:" +nume1+nume2 );
            System.out.println("Numele sunt identice: ".concat(nume1).concat(" ").concat(nume2));
        } else
        {
            System.out.println("Numele sunt diferite: ");
        }
    }
}
