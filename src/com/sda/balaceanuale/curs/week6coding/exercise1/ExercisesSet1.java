package com.sda.balaceanuale.curs.week6coding.exercise1;

public class ExercisesSet1
{

    public static void main(String[] args)
    {
        getTotal(10, 5);
        isEven(100);
        isVowel('n');
        primeNumbers(500);
        isPalindrome(454);
    }


    // Question 1
    //Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
    // Call this method from main( ) and print the results.
    public static int getTotal(int a, int b)
    {
        int sum = a + b;
        System.out.println("Result: " + sum);
        return sum;

    }


    //Question 2
    //Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.
    // Also write a program to test your method.
    public static boolean isEven(int n)
    {
        if (n % 2 == 0)
        {
            System.out.println("Result is true: " + n);
            return true;
        } else
        {
            System.out.println("Result is false: " + n);
            return false;
        }
    }


    //Question 3
    //Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
    // and otherwise returns false.
    // In main() method accept a string from user and count number of vowels in that string.
    public static boolean isVowel(char n)
    {
        switch (n)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Is vowel.");
                return true;
            default:
                System.out.println("Is not vowel.");
                return false;
        }
    }


    //Question 4
    //A prime number is a number that is evenly divisible only by itself and 1.
    // For example, the number 5 is prime because it can be evenly divided only by 1 and 5.
    // The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
    //Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number
    // , or false otherwise. Also write main method that displays prime numbers between 1 to 500.
    public static boolean isPrime(int a)
    {
        boolean isPrimeFlag = true;

        for (int j = 2; j <= a / 2; ++j)
        {
            if (a % j == 0)
            {
                isPrimeFlag = false;
                break;
            }
        }

        return isPrimeFlag;
    }

    public static void primeNumbers(int limit)
    {
        for (int i = 1; i <= limit; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i + " =Is prime.");
            }
        }
    }


    //Question 5
    //A nonnegative integer is called a palindrome if it reads forward and backward in the same way.
    // For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
    // Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome;
    // otherwise, it returns false. Also write a program to test your method.

    public static boolean isPalindrome(int n)
    {
        int temp = n;
        int r;
        int sum = 0;
        while (n > 0)
        {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
        {
            System.out.println("Is a palindrome number " + temp);
            return true;
        } else
        {
            System.out.println("not palindrome");
            return false;
        }
    }

}



