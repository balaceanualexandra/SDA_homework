package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise11

{
    //Exercitiu 11:
//Sa se scrie un program ce citeste 3 numere de la tastatura.
//Sa afiseze numarul compus din cele 3 numere in ordinea introducerii lor.
//Exemplu: nr1 = 1, nr2 = 2, nr3 = 3;
//Sa se afiseze 123.
//Prima data sa se afiseze cu ajutorul tipului String. Hint: folosind System.out.println(....);
//*A doua oara sa se afiseze folosind tipul int. Hint: folosind operatori aritmetici;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numarul1 = scanner.nextInt();
        System.out.println("Primul numar introdus este: " + numarul1);

        System.out.print("Introduceti al doilea numar: ");
        int numarul2 = scanner.nextInt();
        System.out.println("Al doilea numar introdus: " + numarul2);

        System.out.print("Introduceti al treilea numar: ");
        int numarul3 = scanner.nextInt();
        System.out.println("Al treilea numar introdus: " + numarul3);


        System.out.print("Introduceti cele trei numere: ");
        int numere = scanner.nextInt();
        System.out.println("Cele 3 numere introduse sunt: " + numarul1 + numarul2 + numarul3);

        int operatoriAritmetici = numarul1 * 100 + numarul2 * 10 + numarul3 * 1;
        System.out.println("Operatori aritmetici: " + operatoriAritmetici);
    }
}