package com.sda.balaceanuale.homework.week1;

public class ExercisesNr11
{

    //Sa se copieze metoda main impreuna cu continutul ei in interiorul unei clase
    // si sa se corecteze urmatorul program astfel incat sa ruleze,
    // daca contine erori, si sa se comenteze printr-un single-line comment ce a fost gresit inainte:
    // public static void main(String[] args) {
    //        double doubleVar = 19;
    //        boolean boolVar1 = (boolean) '2';
    //        long longVar = 3000000000;
    //        System.out.println(longVar);
    //        float floatVar = 50.21f;
    //        System.out.println(floatVar);
    //        short shortVar;
    //        {
    //            System.out.println(shortVar);
    //            System.out.println(boolVar1);
    //            boolean bool = 10;
    //            System.out.println(double1);
    //            System.out.println(doubleVar);
    //        }
    //        {
    //            char chVar = "2";
    //            {
    //                char chVar1 = '2';
    //                System.out.println(chVar);
    //                {
    //                    String str = "Aici se tine text";
    //                    System.out.println(chVar1);
    //                    System.out.println(str + str);
    //                }
    //                System.out.println(str);
    //                System.out.print("Afisare si ramanere pe acelasi rand!
    //                Trebuie schimbat sa afiseze si sa treaca pe rand nou!");
    //            }
    //            System.out.println(chVar1)
    //        }
    //        System.out.println(bool);
    //        int 2 IntVar = 29;
    //        System.out.println(bool);
    //        int intVar$ = (long) 20.20;
    //        System.out.println(intVar$);
    //    }
    //    System.out.println(doubleVar);
    public static void main(String[] args)
    {
        double doubleVar = 19;
        boolean boolVar1 = true;
        long longVar = 3000000000L;
        System.out.println(longVar);
        float floatVar = 50.21f;
        System.out.println(floatVar);
        short shortVar;
        {
            shortVar=5;
            System.out.println(shortVar);
            System.out.println(boolVar1);
            boolean bool = true;
            System.out.println(doubleVar);
            System.out.println(doubleVar);
        }
        {
            char chaVar = '2';
            {
                char chVar1 = '2';
                System.out.println(chaVar);
                {
                    String str = "Aici se tine text";
                    System.out.println(chVar1);
                    System.out.println(str + str);
                }
               // System.out.println(str);
                System.out.println("Afisare si ramanere pe acelasi rand! Trebuie schimbat sa afiseze si sa treaca pe rand nou!");
            }
           // System.out.println(chaVar1)
        }
        //nu era declarata valoarea bool
        boolean bool=false;
        System.out.println(bool);
        // 2 era pus gresit;
        int IntVar2 = 29;
        System.out.println(bool);
        //$ nu este permis
         doubleVar = 20.20;
        System.out.println(doubleVar);
    }
    //este in afara scopului
    //System.out.println(doubleVar);
    }


