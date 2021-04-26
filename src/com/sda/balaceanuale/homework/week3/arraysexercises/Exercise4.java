package com.sda.balaceanuale.homework.week3.arraysexercises;

public class Exercise4
{

    //4. Write a Java program to find the number
    //of even and odd integers from an array of
    //integers: [1, 7, 3, 10, 9].
    // Output: Odd=4; Even=1.

    public static void main(String[] args)
    {
        int[] arrayNumber = new int[]{1, 7, 3, 10, 9};

        int arrayNumberOdd = 0;
        int arrayNumberEven = 0;

        for (int i = 0; i < arrayNumber.length; i++)
        {
            if (arrayNumber[i] % 2 == 0)
            {
                arrayNumberEven++;

            } else
            {
                arrayNumberOdd++;
            }
        }
        System.out.println(arrayNumberOdd + " numere impare" );
        System.out.println(arrayNumberEven + " numere pare");

    }
}
