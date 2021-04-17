package com.sda.balaceanuale.homework.week1;

public class ExercisesNr9
{

    //9.Sa se copieze metoda main impreuna cu continutul
    // ei in interiorul unei clase si sa se corecteze urmatorul program
    // astfel incat sa ruleze, daca contine erori,
    // si sa se comenteze printr-un single-line comment ce a fost gresit inainte:
    // public static void main(String[] args) {
    //        int var1 = 10;
    //        short var2 = var1;
    //        {
    //            System.out.println(var1);
    //            boolean var3 = false;
    //            System.out.println(var3);
    //            {
    //                int var4;
    //                System.out.println(var3);
    //                System.out.println(var4);
    //            }
    //            System.out.println(var4);
    //            {
    //                int var5;
    //                {
    //                    double var6 = var5;
    //                    System.out.println(var6);
    //                }
    //                System.out.println(var6 + var5);
    //            }
    //            System.out.println(var5);
    //            float var7 = 20.56;
    //            System.out.println(var7);
    //        }
    //        System.out.println(var1 + var3);
    //        System.out.println(var3);
    public static void main(String[] args)
    {
        int var1 = 10;
       //short var2 = var1; nu este complilabil.
        int var2 = var1;
        {
            System.out.println(var1);
            boolean var3 = false;
            System.out.println(var3);
            {
                int var4 = 5;
                System.out.println(var3);
                System.out.println(var4);
            }
            //variabila 4 nu este in scop.
            //System.out.println(var4);
            {
                int var5 = 10;
                {
                    double var6 = var5;
                    System.out.println(var6);
                }
                //System.out.println(var6 + var5);
            }
            //System.out.println(var5);
            float var7 = 20.56f;
            System.out.println(var7);
        }
        //nu este in scop, boolean nu poate fi concatenat cu int.
        //System.out.println(var1 + var3);
       // System.out.println(var3);
    }

    }

