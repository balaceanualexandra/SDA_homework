package com.sda.balaceanuale.homework.week1;

public class ExercisesNr6
{

    //6.Sa se declare si initializeze 2 variabile de tip int si sa se interschimbe valorile celor 2 variabile.
    //Sa se faca acest lucru si pentru variabile de tip boolean, long, float, si double.
    //Sa se afiseze mesaje corespunzatoare pentru fiecare interschimbare.
    //Exemplu:
    //int a = 2, b = 4;
    //sout("valoarile vechi ale variabilelor: );
    //sout("a = " + a);
    //sout("b = " + b);
    //interschimare
    //sout("valoarile noi ale variabilelor: );
    //sout("a = " + a);
    //sout("b = " + b);
    //Asa pentru fiecare tip de variabile scrise mai sus.
    public static void main(String[] args)
    {
        {
            int a = 2;
            int b = 4;
            System.out.println("valoarile vechi ale variabilelor:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("interschimare");
            System.out.println("valoarile noi ale variabilelor:");
            int c = a;
            a = b;
            b = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        {
            double a = 2.5;
            double b = 4.5;
            System.out.println("valoarile vechi ale variabilelor:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("interschimare");
            System.out.println("valoarile noi ale variabilelor:");
            double c = a;
            a = b;
            b = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        {

            long a = 10000;
            long b = 50000;
            System.out.println("valoarile vechi ale variabilelor:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("interschimare");
            System.out.println("valoarile noi ale variabilelor:");
            long c = a;
            a = b;
            b = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        {
            boolean a = true;
            boolean b = false;
            System.out.println("valoarile vechi ale variabilelor:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("interschimare");
            System.out.println("valoarile noi ale variabilelor:");
            boolean c = a;
            a = b;
            b = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
        {
            float a = 3.5f;
            float b = 8.5f;
            System.out.println("valoarile vechi ale variabilelor:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("interschimare");
            System.out.println("valoarile noi ale variabilelor:");
            float c = a;
            a = b;
            b = c;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}


