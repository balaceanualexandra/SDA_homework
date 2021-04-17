package com.sda.balaceanuale.homework.week1;

public class ExercisesExtra1
{
    //1.Sa se copieze metoda main impreuna cu continutul ei
    // in interiorul unei clase si sa se corecteze urmatorul program
    // astfel incat sa ruleze, daca contine erori, si sa se comenteze
    // printr-un single-line comment ce a fost gresit inainte:
    public static void main(String[] args) {
        int intVar = 2;

        System.out.println(intVar);
        {
            double doubleVar = 29.38;
            System.out.println(doubleVar);
            double var1 = 31.5;
            System.out.println(var1);
        }
        double var1 = 31.5;
        System.out.println(var1);
        int val1 =29;
        {

            System.out.println(intVar);
            float floatVar1 = 20.18f;
            System.out.println(floatVar1);
            {
                boolean boolVal = true;
            }
            {
                int boolVal = 12;
                System.out.println(boolVal);
                System.out.println(val1);
                {
                    String str = "String text value";
                    System.out.println(str);
                }
                System.out.println("str");
                {
                    {
                        {
                            int val2;
                            int val3 =5;

                            char ch1 = 2;
                            System.out.println(val3);
                        }
                        long longVar2 = 12;
                        {
                            long longVar1 = 199999L;
                            float floatVar = 29.59f;
                            {
                                char ch1 = 2;
                                System.out.println(ch1);
                                System.out.println(longVar1);
                            }
                        }
                        float floatVar=15.4f;
                        System.out.println(floatVar);
                        long longVar1= 76L;
                        System.out.println(longVar1);
                    }
                }
                System.out.println("str");
            }
            long longVar2 = 789L;
            System.out.println(longVar2);
            System.out.println(val1);
        }
        float floatVar2 = 86.56f;
        System.out.println(floatVar2);
        System.out.println(val1);
    }
}