package com.sda.balaceanuale.homework.week1;

public class ExercisesExtra2
{
    // 2.Sa se copieze metoda main impreuna cu continutul ei
    // in interiorul unei clase si sa se corecteze urmatorul program astfel incat sa ruleze,
    // daca contine erori, si sa se comenteze printr-un single-line comment ce a fost gresit inainte:
    public static void main(String[] args)
    {
        double doubleVar = 19.2;
        System.out.println(doubleVar);
        //nu este nevoie de ghilimele;
        doubleVar = 2.20;
        System.out.println(doubleVar);
        //punem la final , este long;
        long longVar = 300000000L;
        System.out.println(longVar);
        //(double)- nu este necesar
        float floatVar = 50.21f;
        System.out.println(floatVar);
        //_ nu se pune in fata, 50000, este valoare mare pt short;
        short shortVar = 5;
        {
            //nu era declarat boolean;
            boolean boolVar1 = false;
            System.out.println(shortVar);
            System.out.println(boolVar1);
            {
                //era decalart gresit
                int nr5 = 24;
                {
                    System.out.println(nr5);
                    System.out.println(shortVar);
                    //nr5 era declarata
                    int nr6 = 45;
                }
                System.out.println(nr5);
            }
        }
        {
            {
                //nu era declarata valoarea chVar7
                char chVar7 = 20;
                System.out.println("valoare=" +chVar7);
            }
            char chVar7 = 20;
            {
                char chVar1 = 10;
                System.out.println(chVar1);
                {
                    String str = "text";
                    System.out.println(chVar1);
                    System.out.println(str + str);
                }
                System.out.println("str");
                {
                    System.out.println("str");
                }
                System.out.println(chVar1);
            }
            boolean bool = true;
            System.out.println(bool);
            int IntVar2 = 87;
            System.out.println(IntVar2);
            int intVar4 = 20;
            System.out.println(intVar4);
        }
        System.out.println(doubleVar);
    }

}