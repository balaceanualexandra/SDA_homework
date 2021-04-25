package com.sda.balaceanuale.homework.week3.arraysexercises;

public class Exercise3
{

    // 3. Write a Java program to reverse(inverseaza) an array
    //of integer values: [1, 7, 3, 10, 9]
    // Output: [9, 10, 3, 7, 1].

    public static void main(String[] args)
    {
       int[] intArrayNumber = new int[] {1, 7, 3, 10, 9};
       int [] reverseArray = new int[intArrayNumber.length];

        for (int i = 0; i < intArrayNumber.length; i++)
        {
           reverseArray[reverseArray.length -1 -i]= intArrayNumber[i];
        }
        
        System.out.println("Inversul numerelor este: " );
        for (int element : reverseArray)
        {
            System.out.println("Element: " + element);
        }
    }

}
