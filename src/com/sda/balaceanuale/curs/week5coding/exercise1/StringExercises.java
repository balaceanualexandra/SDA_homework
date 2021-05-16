package com.sda.balaceanuale.curs.week5coding.exercise1;

import java.util.Locale;

public class StringExercises
{
    public static void main(String[] args)
    {
        //System.out.println("Hello! ");
        //System.out.println("John");
        System.out.println("Hello \n John");
        System.out.println("------------");
        System.out.println(convertString("STRING TO BE CONVERTED", " TEXT ", true));
        System.out.println("STRING".toLowerCase());

        System.out.println("    J    a    V     V        a");
        System.out.println("    J   a a    V    V      a   a");
        System.out.println("J   J  aaaaa    V  V      aaaaaa");
        System.out.println("  JJ   a    a     V      a      a");
        System.out.println();
        System.out.println(reverseString("Java"));
        System.out.println(extractHalf("Programmer"));
        System.out.println(concatenat("Java", "Fundamentals"));
        compareString( "This is a comparison", "THIS is A Comparison");
    } //metoda care sa faca conversia pentru u  string ( din lower in upper case)

    public static String convertString(String str, String str2, boolean uppercase)
    {
        String result = str + str2;
        if (uppercase)
        {
            result = result.toUpperCase();
        } else
        {
            result = result.toLowerCase();
        }
        return result;
    }

    //4

    public static String reverseString(String str)
    {
        int size = str.length() - 1;
        String reverse = "";
//           for (int i = 0; i<str.length(); i++) {
        // reverse += str.charAt(size);
        //size--;
        //reveres = reverse +
//           }
//
        while (size >= 0)
        {
            reverse += str.charAt(size);
            size--;
        }
        return reverse;
    }
//Write a Java program to extract the first half of a string of even length: “Programmer”
//Output: Prog

    public static String extractHalf(String string)
    {
        return string.substring(0, string.length() / 2);
    }
//6. Write a Java program to create the concatenation of the two strings except removing the first
//character of each string. The length of the strings must be 1 and above: “Java” and
//“Fundamentals”
//Output: avaundamentals

    public static String concatenat(String param1, String param2)
    {
        if (param1.length() >= 1 && param2.length() >= 1)
        {
            return param1.substring(1, param1.length()) + param2.substring(1, param2.length());
        }
        return "";
    }
    //8. Write a java program to compare two strings lexicographically, ignoring case differences: “This
   // is a comparison” equals “THIS is A Comparison”

    public static void compareString(String string1, String string2)
    {
        if (string1.equalsIgnoreCase(string2))
        {
            System.out.println("ignoring case differences: " + string1 + " equals " + string2);
        } else
        {
            System.out.println("ignoring case differences: " + string1 + "not equals " + string2);
        }

    }
//    9. Write a Java program to check whether a given string ends with the contents of another
//string: “Java exercises” ends with “ses”

//10. Write a Java program to compute the sum of the digits of an integer: 133
        //Output: 7}
    //public static int number

    }