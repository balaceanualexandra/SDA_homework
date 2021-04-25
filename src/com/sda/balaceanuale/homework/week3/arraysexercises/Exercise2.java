package com.sda.balaceanuale.homework.week3.arraysexercises;

public class Exercise2
{

    // 2. Write a Java program to print all odd (impare)
    //numbers from an array: [1, 7, 3, 10, 9].
    // Output: 1, 7, 3, 9

    public static void main(String[] args)
    {
       int[] arrayNumber = new int[] {1, 7, 3, 10, 9};

        for (int i = 0; i < arrayNumber.length; i++)
        {
            if (arrayNumber[i] % 2 ==1)
            {
                System.out.println("Numarul impar este: " + arrayNumber[i]);
            }

        }

    }

}
