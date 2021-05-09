package com.sda.balaceanuale.homework.recap;

import com.sda.balaceanuale.curs.week2.Main;

import java.util.Scanner;
// Sa se citeasca numere de la tastatura, cat timp numarul introdus nu este zero.

public class ExercitiiWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numarStart;
        do {
            System.out.println("Introdu un numar: ");
            numarStart = scanner.nextInt();

        } while (numarStart != 0);
    }


    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int numarStart = scanner.nextInt();
        while (numarStart != 0) {
            System.out.println("Introduceti un alt numar: ");
            numarStart = scanner.nextInt();
        }
    }

}
