package com.sda.balaceanuale.curs.week6coding.exercise1;

public class ExercisesSet2
{

    public static void main(String[] args)
    {
        smallestNumber(25, 37, 29);
        average(25, 45, 65);
        middleCharacter("350");
        vowelsNumbers("w3resource");
    }

    // 1. Write a Java method to find the smallest number among three numbers. Go to the editor
    //Test Data:
    //Input the first number: 25
    //Input the Second number: 37
    //Input the third number: 29
    //Expected Output:
    //
    //The smallest value is 25.0
    public static int smallestNumber(int a, int b, int c)
    {
        int min = a;
        if (b < min)
        {
            min = b;
        }
        if (c < min)
        {
            min = c;
        }
        System.out.println("Minim is: " + min);
        return min;
    }

    //2. Write a Java method to compute the average of three numbers. Go to the editor
    //Test Data:
    //Input the first number: 25
    //Input the second number: 45
    //Input the third number: 65
    //Expected Output:
    //
    //The average value is 45.0
    public static double average(double a, double b, double c)
    {
        double average = (a + b + c) / 3;
        System.out.println("Average is: " + average);
        return average;
    }


    //3. Write a Java method to display the middle character of a string. Go to the editor
    //Note: a) If the length of the string is odd there will be two middle characters.
    //b) If the length of the string is even there will be one middle character.
    //Test Data:
    //Input a string: 3500
    //Expected Output:
    //
    //The middle character in the string: 5

    public static String middleCharacter(String value)
    {
        {
            int position;
            int length;

            // 3'50'0 -> 2, 2
            if (value.length() % 2 == 0)
            {
                position = value.length() / 2 - 1;
                length = 2;
            }
            // 3'5'0, 2, 1
            else
            {
                position = value.length() / 2;
                length = 1;
            }

            String result = value.substring(position, position + length);
            System.out.println("Middle character: " + result);
            return result;
        }


    }


    //4. Write a Java method to count all vowels in a string. Go to the editor
    //Test Data:
    //Input the string: w3resource
    //Expected Output:
    //
    //Number of  Vowels in the string: 4
    public static int vowelsNumbers(String value)
    {
        int result = 0;
        for (char c : value.toCharArray())
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result++;
                    break;
            }
        }
        System.out.println("Number of  Vowels in the string:" + result);
        return result;
    }

    //5. Write a Java method to count all words in a string. Go to the editor
    //Test Data:
    //Input the string: The quick brown fox jumps over the lazy dog.
    //Expected Output:
    //
    //Number of words in the string: 9


    //6. Write a Java method to compute the sum of the digits in an integer. Go to the editor
    //Test Data:
    //Input an integer: 25
    //Expected Output:
    //
    //The sum is 7


    //7. Write a Java method to display the first 50 pentagonal numbers. Go to the editor
    //Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
    //Expected Output:
    //
    //1     5     12    22    35    51    70    92    117   145
    //176   210   247   287   330   376   425   477   532   590
    //651   715   782   852   925   1001  1080  1162  1247  1335
    //1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
    //2501  2625  2752  2882  3015  3151  3290  3432  3577  3725


    //8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years. Go to the editor
    //Sample data (Monthly compounded) and Output:
    //Input the investment amount: 1000
    //Input the rate of interest: 10
    //Input number of years: 5
    //
    //Expected Output:
    //
    //Years    FutureValue
    //1            1104.71
    //2            1220.39
    //3            1348.18
    //4            1489.35
    //5            1645.31


    //9. Write a Java method to print characters between two characters (i.e. A to P ). Go to the editor
    //Note: Prints 20 characters per line
    //
    //Expected Output:
    //
    //( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
    //< = > ? @ A B C D E F G H I J K L M N O
    //P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
    //d e f g h i j k l m n o p q r s t u v w
    //x y z


    //10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor
    //
    //Expected Output:
    //
    //Input a year: 2017
    //false


    //11. Write a Java method to check whether a string is a valid password. Go to the editor
    //Password rules:
    //A password must have at least ten characters.
    //A password consists of only letters and digits.
    //A password must contain at least two digits.
    //
    //Expected Output:
    //
    //1. A password must have at least eight characters.
    //2. A password consists of only letters and digits.
    //3. A password must contain at least two digits
    //Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
    //Password is valid: abcd1234


    //12. Write a Java method (takes a number n as input) to displays an n-by-n matrix. Go to the editor
    //
    //Expected Output:
    //
    //Input a number: 10
    //1 0 0 1 1 0 0 0 1 1
    //0 0 1 0 1 0 1 0 0 0
    //0 1 0 1 0 0 0 0 0 1
    //1 1 1 0 0 0 0 1 1 1
    //1 1 0 1 1 1 0 1 0 0
    //1 0 0 0 1 1 0 0 0 0
    //0 0 1 0 0 0 0 1 1 1
    //1 1 0 1 0 1 0 0 1 0
    //0 0 1 0 0 0 0 1 1 0
    //1 1 1 0 0 1 1 1 1 0


    //13. Write Java methods to calculate the area of a triangle. Go to the editor
    //
    //Expected Output:
    //
    //Input Side-1: 10
    //Input Side-2: 15
    //Input Side-3: 20
    //The area of the triangle is 72.6184377413890


    //14. Write a Java method to create the area of a pentagon. Go to the editor
    //
    //Expected Output:
    //
    //Input the number of sides: 5
    //Input the side: 6
    //The area of the pentagon is 61.93718642120281


    //15. Write a Java method to display the current date and time. Go to the editor
    //
    //Expected Output:
    //
    //Current date and time: Wednesday January 25, 2017 7:47:43


    //16. Write a Java method to find all twin prime numbers less than 100. Go to the editor
    //
    //Expected Output:
    //
    //(3, 5)
    //(5, 7)
    //(11, 13)
    //(17, 19)
    //(29, 31)
    //(41, 43)
    //(59, 61)
    //(71, 73)
}
