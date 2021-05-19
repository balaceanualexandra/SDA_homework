package com.sda.balaceanuale.curs.week6coding.exercise1;

public class DataTypeExercises
{

    public static void main(String[] args)
    {
        sumNumbers(23, 34);
        divideNumbers(56, 8);
        printResult();
        computeExpressions();
        circle(7.5);
        average(10, 20, 30);
        rectangle(5.5, 8.6);
        swap();
        compareNumbers(25, 39);
        computeSum(133);
    }

    //1. Write a Java program to print the sum of two numbers: 74 + 36 = 110
    public static void sumNumbers(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }

    //2. Write a Java program to divide two numbers and print on the screen: 50 / 3 = 16 remainder 2
    public static void divideNumbers(int c, int d)
    {
        int divide = c / d;
        System.out.println(divide);
    }

    //3. Write a Java program to print the result of the following operations:
    //   -5 + 8 * 6 = 43
    //   (55+9) % 9 = 1
    //   20 + -3*5 / 8 = 19
    //   5 + 15 / 3 * 2 - 8 % 3 = 13
    public static void printResult()
    {
        int a = -5 + 8 * 6;
        System.out.println("Result -5 + 8 * 6 =  " + a);
        int b = (55 + 9) % 9;
        System.out.println("Result (55+9) % 9 =  " + b);
        int c = 20 + -3 * 5 / 8;
        System.out.println("Result 20 + -3*5 / 8 =  " + c);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Result 5 + 15 / 3 * 2 - 8 % 3 =  " + d);
    }

    //4. Write a Java program to compute the specified expressions and print the output:
    //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.138888888888889
    public static void computeExpressions()
    {
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("Result ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + result);
    }

    //5. Write a Java program to print the area and perimeter of a circle: radius = 7.5
    //Output: Area = 176.71458676442586; Perimeter = 47.12388980384689
    public static void circle(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("result area circle = " + area);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("result perimeter circle = " + perimeter);
    }

    //6. Write a Java program that takes three numbers as input to calculate and print the average of
    //the numbers: 10, 20, 30
    //Output: Average = 20
    public static void average(int a, int b, int c)
    {
        int average = (a + b + c) / 3;
        System.out.println("Result average = " + average);
    }

    // 7. Write a Java program to print the area and perimeter of a rectangle: Width = 5.5; Height = 8.5
    // Output: Area = 47.60; Perimeter = 28.20
    public static void rectangle(double width, double height)
    {
        double area = width * height;
        System.out.println("Result area rectangle =" + area);
        double perimeter = 2 * (width + height);
        System.out.println("Result perimeter rectangle =" + perimeter);
    }

    //8. Write a Java program to swap two variables: a = 5; b = 13
    //  Ouput: a = 13; b = 5;
    public static void swap()
    {
        int a = 5;
        int b = 13;
        int c = a;
        a = b;
        b = c;
        System.out.println("result a = " + a);
        System.out.println("result b = " + b);
    }

    //9. Write a Java program to compare two numbers and print if they are:
    //   equal
    //   different,
    //   smaller,
    //   larger,
    //   smaller or equal,
    //   larger or equal:
    //
    //   25; 39
    //   25 != 39
    //   25 < 39
    //   25 <= 39
    public static void compareNumbers (int a, int b){
        if(a==b) {
            System.out.println(a+ " = " + b);
        } if (a != b){
            System.out.println(a+ " != " + b);
        }if(a < b){
            System.out.println(a+ " < " + b);
        }if (a > b) {
            System.out.println(a+ " > " + b);
        }if(a <= b) {
            System.out.println(a+ " <= " + b);
        }if(a >= b) {
            System.out.println(a+ " >= " + b);
        }

    }

    //10. Write a Java program to compute the sum of the digits of an integer: 133
    //  Output: 7
    public static void computeSum(int a) {
        int sum = 0;
        while (a != 0)
        {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("Result compute the sum " + sum);

    }
}
