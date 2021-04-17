package com.sda.balaceanuale.homework.week1;

public class ExercisesNr10
{

    //Sa se copieze metoda main impreuna cu continutul ei in interiorul unei clase
    // si sa se corecteze urmatorul program astfel incat sa ruleze,
    // daca contine erori, si sa se comenteze printr-un single-line comment ce a fost gresit inainte:
    // public static void main(String[] args) {
    //        int var1Int = 10;
    //        short var2 = var1;
    //        {
    //           byte varByte = 128;
    //            System.out.println(varByte);
    //            System.out.println(var1);
    //        }
    //        {
    //            float float = 20f;
    //            {
    //                double boolean = 29.350;
    //                System.out.println(boolean);
    //            }
    //            System.out.println(boolean)
    //            System.out.println(float);
    //        }
    //        System.out.println(var1Int + var3);
    //        System.out.println(var3);
    //        System.out.println(float)
    //        System.out.println(var1Int);
    //    }
    public static void main(String[] args)
    {
        short var1Int = 10;
        short var1 = var1Int;
        {
            short varByte = 128;
            System.out.println(varByte);
            System.out.println(var1);
        }
        {
            float varFloat = 20f;
            {
                double varDouble1 = 29.350;
                System.out.println(varDouble1);
            }
            //variabila nu este in scop.
           // System.out.println(varDouble1)
            System.out.println(varFloat);
        }
        int var3=45;
        System.out.println(var1Int + var3);
        System.out.println(var3);
        //variabila nu este in scop,
        //de asemenea este denumita incorect.
       // System.out.println(float)
        System.out.println(var1Int);
    }

}

