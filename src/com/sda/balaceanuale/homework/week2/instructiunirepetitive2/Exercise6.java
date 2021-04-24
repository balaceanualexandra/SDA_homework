package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;


import java.util.Scanner;

public class Exercise6
{
    //  Exercitiul6:
    //  Scrieti un program care citeaste cuvinte de la tastatura pana la apasarea tastei Enter.
    //  Sa se construiasca si afiseze o propozitie cu acele cuvinte.
    //  Hint: Enter inseamna string gol ("");
    //  Pentru verificare ca s a introdus un string gol
    //  se va face urmatoarea comparatie "!stringVariable.equals("")".
    //  Aceasta expresie ne intoarce true daca valorile Stringurilor sunt identice sau false daca sunt diferite.
    //      Exemplu:
    //          User input:
    //          buna
    //          ce
    //          mai
    //          faci
    //          ?
    //          enter
    //      Java program output:
    //          Propozitia creeata este: Buna ce mai faci?
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un text: ");
        String variabilaText = scanner.nextLine();
        String variabilaResult = "";

        while (!variabilaText.equals(""))
        {
            variabilaResult = variabilaResult + " " + variabilaText;
            System.out.println(variabilaResult);

            System.out.println("Introduceti urmatorul cuvant: ");
            variabilaText = scanner.nextLine();
        }

        System.out.println("Propozitia creeata este:");
        System.out.println(variabilaResult);
    }
}


