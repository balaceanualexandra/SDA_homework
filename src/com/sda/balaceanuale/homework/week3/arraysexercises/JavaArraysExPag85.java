package com.sda.balaceanuale.homework.week3.arraysexercises;

import java.util.Arrays;

public class JavaArraysExPag85
{
    public static void main(String[] args)
    {
//        4. Write a Java program to find the number
//        of even and odd integers from an array of
//        integers: [1, 7, 3, 10, 9].
//        Output: Odd=4; Even=1.
        int[] intArr = {1, 7, 3, 10, 9, 5};

        System.out.println("Elementele array-ului sunt: ");
        //afisarea array-ului
        for (int i = 0; i < intArr.length; i++)
        {
            System.out.println("Elementul " + (i + 1) + ": " + intArr[i]);
        }


        int nrPare = 0;
        int nrImpare = 0;
        //verificam fiecare element din array si il adaugam la controrul respespectiv in functie daca este par sau impar
        for (int index = 0; index < intArr.length; index++)
        {
            if (intArr[index] % 2 == 0)
            {
                nrPare++;
            } else
            {
                nrImpare++;
            }
        }
        System.out.println("Avem " + nrPare + " elemente pare in array si " + nrImpare + " elemente impare in array!");
//        6. Write a Java program to find the second
//        largest element in an array: [1, 7, 3, 10, 9].
//        Output: 9.
        int[] array = {1, 7, 3, 10, 9, 5};
        //SORTAREA ELEMENTELOR UNUI ARRAY IN ORDINE CRESCATOARE -> tema: DE SORTAT UN ARRAY IN ORDINE DESCRESCATOARE!!!
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }

        System.out.println("Array-ul sortat crescator este: ");
        //afisarea array-ului sortat
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Elementul " + (i + 1) + ": " + array[i]);
        }

        System.out.println("Al doilea maxim din array este " + array[array.length - 2]); // array[4]

        int[] intArray = {1, 3, 2, 10, 48, 12, 3, 28, 19};
        //afisam elementele array-ului folosing metoda toString din clasa Arrays
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);//ordoneaza crescator elementele array-ului
        System.out.println(Arrays.toString(intArray));

//        5. Write a Java program to find the duplicate
//        values of an array of integer values: [1, 7, 3, 7, 10, 1, 9].
//        Output: 1, 7.
        int[] intArrayEx5 = {1, 7, 3, 7, 10, 1, 9}; //ramane tema

    }
}
