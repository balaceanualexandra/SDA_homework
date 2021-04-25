package com.sda.balaceanuale.curs.week3;

import java.util.Scanner;

public class JavaArrays
{
    public static void main(String[] args) {
        //Afisarea elementelor unui array
        //Introducerea elementelor unui array de la tastatura
        //Afisarea elementelor pare ale unui array
        //Suma numerelor unui array
        //Produsul elementelor pare divizibile cu 3 unui array de numere intregi al carui valori le cuastem;
        //Gasirea maximului unui aray
        //Gasirea minimului unui array

        //Afisarea elementelor unui array
        int[] arrayInt = new int[4]; // declararea si instantierea unui array caruia nu ii stim elementele. Le vom citi de la tastatura.

        //afisare array
        System.out.println("Elementele array-ului sunt: ");
        for(int index = 0; index < arrayInt.length; index++){
            System.out.println("Elementul " + index + ": " + arrayInt[index]);
        }

        //Partea de atribuire de valori elementului array-ului citind aceste valori de la tastatura
        Scanner scannerNumere = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului:");
        for(int index = 0; index < arrayInt.length; index++){
            System.out.print("Introdu elementul " + index + ": ");
            arrayInt[index] = scannerNumere.nextInt();
        }

        //afisare a tuturor elementelor array-ului modificat cu elemente citite de la tastatura
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Elementul " + i + ": " + arrayInt[i]);
        }

        System.out.println("Elementele pare ale array-ului: ");
        //Afisarea elementelor pare ale unui array
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0){
                System.out.println("Elementul " + i + ": " + arrayInt[i]);
            }
        }

        //Suma elementelor unui array de numere cu zecimale al carui valori le cuastem;
        double[] doubleArray = {2.1, 8, 10, 1, 3.2};
        double sum = 0.0;
        for(int i = 0; i < doubleArray.length; i++){
            sum = sum + doubleArray[i];
        }
        System.out.println("Suma elementelor array-ului este: " + sum);

        //Produsul elementelor pare divizibile cu 3 unui array de numere intregi al carui valori le cuastem;
        int[] array = {1,2,3,4,5,10,6,38,17,20,36};
        int produs = 1;
        for(int idx = 0; idx < array.length; idx++){
            if (array[idx] % 2 == 0 && array[idx] % 3 == 0){
                produs = produs * array[idx];
            }
        }
        System.out.println("Produsul elementelor pare si divizibile cu 3 ale array-ului este: " + produs);

        //Gasirea si afisarea maximului elementelor unui array. (valoarea cea mai mare din array)
        //se presupune ca max sau min este primul element din array dupa care vom compara toate elementele de dupa primul element cu max/min curent
        //daca gasesc un max/min mai mare/mic decat cel curent => max/min va lua valoare elementului care a fost mai mare/mic ca max/min ul meu curent
        int max = array[0];//1 2 3 4 ... 10 38
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximul array-ului este: " + max);

        //minim

        int min = array[0];
        for (int i = 1;i < array.length; i++) {
            if (array[i] <min) {
                min = array[i];

            }
        }
        System.out.println( "Minimul array-ului este : " + min);

    }
}
