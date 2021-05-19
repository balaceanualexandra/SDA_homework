package com.sda.balaceanuale.curs.week6coding.exercise1;

public class LoopExercises
{

    public static void main(String[] args)
    {
        multiplication(8, 10);
        evenNumber(100);
        dispLayN(5);
        numberDivisible(100);
        powerNumbers(3, 100);
    }

    // 1. Write a Java program that takes a number and prints its multiplication table up to 10: 8
    //  Output: 8, 16, 24, 32, …, 80
    public static void multiplication(int number, int limit)
    {
        for (int i = 1; i <= limit; i++)
        {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    //2. Write a Java program that lists all even numbers from 1 to 100
    //  Output: 2, 4, 6, 8, ...,100
    public static void evenNumber(int limit)
    {
        for (int i = 1; i <= limit; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even numbers : " + i);
            }
        }
    }

    //3. Write a Java program that accepts an integer (n) and displays n, nn, nnn, nnnn, nnnnnn: 5
    //  Output: 5, 55, 555, 5555, 55555
    public static void dispLayN(int n)
    {
        for (int i = 1; i <= 5; i++)
        {
            String number = " ";
            for (int j = 1; j <= i; j++)
            {
                number = number + n;
            }
            System.out.println(number);
        }
    }

    //4. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both
    //  Divided by 3 - 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69,
    //      72, 75, 78, 81, 84, 87, 90, 93, 96, 99
    //  Divided by 5 - 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
    //  Divided by 3 & 5 - 15, 30, 45, 60, 75, 90
    public static void numberDivisible (int limit){
        String dividedBy3 = " ";
        String dividedBy5 = " ";
        String dividedBy3And5 = " ";
        for (int i =1; i <=limit; i++){
            if(i % 3 ==0){
                dividedBy3 = dividedBy3+i +",";
            }if(i % 5 ==0){
                dividedBy5 = dividedBy5+i +",";
            }if(i % 3 ==0 && i % 5 ==0){
                dividedBy3And5 = dividedBy3And5+i +",";
            }
        }
        System.out.println("Divided by 3 = "+ dividedBy3);
        System.out.println("Divided by 5 = "+ dividedBy5);
        System.out.println("Divided by 3 & 5 = "+ dividedBy3And5);
    }



    //5. Write a Java program that prints all the powers of a number under 100: 3
    //  Output: 3, 9, 27, 81
    public static void powerNumbers(int number, int limit) {
        String result = " ";
        int power = number;
        int i = 2;
        while (power <= limit) {
           result = result + power + ",";
           power = (int) Math.pow(number,i);
           i++;

        }System.out.println(result );
    }


    // 6. Write a Java program to print Fibonacci series of n terms: 10
    //  Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


    //7. Write a Java program to print the following:
    //       1
    //      222
    //     33333
    //    4444444
    //   555555555


    //8. Write a program that prints the first n prime numbers: n = 4
    //  Output: 2, 3, 5, 7


    //9. Write a program that prints the first n numbers, with an n increment: n=4
    //  Output: 4, 8, 12, 16


    //10. Write a java program to calculate the factorial value of given number: n=5
    //  Output: 120 (1*2*3*4*5)

}
