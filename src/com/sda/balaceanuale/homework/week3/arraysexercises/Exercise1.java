package com.sda.balaceanuale.homework.week3.arraysexercises;

public class Exercise1
{

    // Write a Java program to calculate the
    //average value of array elements: [1, 7, 3,
    //10, 9].
    // Output: 6
    public static void main(String[] args)
    {
        int[] intArray = new int[] {1, 7, 3, 10, 9};
        int sum =0;
        for (int i = 0; i < intArray.length; i++)
        {
           sum = sum + intArray[i] ;

        }
        int average = sum / intArray.length;
        System.out.println("Media numerelor este : " + average);
    }

}
