package com.sda.balaceanuale.homework.week2.operatii;

import java.util.Scanner;

public class Exercise10
{
         //Exercitiu 10:
 //Sa se scrie un program ce citeste de la tastatura 2 numere intregi si un al treilea numar cu zecimale.
         // Ex: "Numar1 intreg: "
 //Sa se incrementeze valoarea primului numar si sa se decrementeze valoarea celui de-al doilea numar.
 //Sa se calculeze suma celor trei numere intr-un bloc de cod separat.
 //Cand se face suma acestor 3 numere, primele 2 numere intregi trebuie sa aiba deja valorile modificate.
 //Suma celor trei numere trebuie afisata atat ca numar intreg cat si ca numar cu zecimale(floating-point),
         // in metoda main.
 //Ex: "Suma celor 3 numere in format intreg este: " + suma
 //    "Suma celor 3 numere in format cu zecimale este: " + suma
         public static void main(String[] args)
         {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Introduceti primul numar intreg: ");
          int numar1 = scanner.nextInt();
          System.out.println("Primul numar intreg este: " +numar1);

          System.out.println("Introduceti al doilea numar intreg: ");
          int numar2 = scanner.nextInt();
          System.out.println("Al doilea numar intreg este: " +numar2);

          System.out.println("Introduceti un numar cu zecimale: ");
          double numar3 = scanner.nextDouble();
          System.out.println("Numarul cu zecimale introdus este: " +numar3);

          numar1 = ++numar1;
          System.out.println("Valoarea numarului incrementat este: " + numar1);
          numar2 = --numar2;
          System.out.println("Valoarea numarului decrementat este: "+ numar2);

          {
           double resultSumZecmal = (double) (numar1 +numar2 + numar3);
           System.out.println("Rezultatul sumei numerelor cu zecimale:" + resultSumZecmal);
           int resultSumInteger = (int) (numar1 +numar2 + numar3);
           System.out.println("Rezultatul sumei numerelor fara zecimale este:" + resultSumInteger);
          }
          }
}