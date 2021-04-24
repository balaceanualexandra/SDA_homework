package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;

import java.util.Scanner;

public class Exercise1
{
    //  Exercitiul1:
    //  Scrieti un program care afiseaza suma primelor n numere divizibile cu 2 dar care nu sunt divizibile cu 3.
    //  n citit de la tastatura.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int nNumarGasit = scanner.nextInt();
        int numarCurent = 2;
        int sum = 0;

        while (nNumarGasit > 0)
        {
            System.out.println("Numar curent: " + numarCurent);
            if (numarCurent % 2 == 0 && numarCurent % 3 != 0)
            {
                System.out.println("Numarul divizibil cu 2: " + numarCurent + " ,dar nu este divizibil cu 3.");
                nNumarGasit--;
                sum += nNumarGasit;
            }
            numarCurent++;
        }

        System.out.println("Suma numerelor divizibile cu 2: " + sum + " dar nu sunt divizibile cu 3.");
    }
}
