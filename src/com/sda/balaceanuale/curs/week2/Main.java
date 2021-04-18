package com.sda.balaceanuale.curs.week2;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        boolean booleanVar = false;


        if (booleanVar)
        {
            System.out.println("conditia este adevarata");
        } else
        {
            System.out.println("conditia este falsa");
        }

        int varInt = 5;

        if (varInt == 0)
        {
            System.out.println("numarul este 0");
        } else if (varInt > 0)
        {
            System.out.println("numarul este mai mare decat 0");
        } else
        {
            System.out.println("numarul este mai mic decat zero");
        }

        String stringVar = "textul";
        stringVar.charAt(1);
        System.out.println(stringVar.charAt(1));

        String stringVar2 = "";
        System.out.println(stringVar2.isEmpty());

        Scanner scannerCitire = new Scanner(System.in);
        String varString1 = scannerCitire.nextLine();
        if (varString1.isEmpty())
        {
            System.out.println("valoare goala");
        }
        else
        {
            System.out.println("valoarea numarului nu este goala");
        }
    }
}
