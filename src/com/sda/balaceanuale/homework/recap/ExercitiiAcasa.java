package com.sda.balaceanuale.homework.recap;

/**
 * my first javadoc
 */
public class ExercitiiAcasa {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Afiseaza continut.");
        System.out.println("Buna ziua!"); // instructiune de afisarea si trecere pe o noua linie in consola unde se afiseaza tot ce este in metoda main
        System.out.println(2);
        System.out.print(2);
        ExercitiiAcasa invatDoc = new ExercitiiAcasa();
        System.out.println("Hello world!");
        System.out.println(2); // instructiune de afisare fara sa treaca pe o nou alinie
        System.out.println();
        System.out.println("asta");

        //De aici inainte vom vorbi despre primitivele din limbajul java -> single line comment
        /*linia1
        linia2   -> multi line comment
        linia3*/

        // TODO: INVAT!
        // Declararea de variabile!!!
        //boolean
        boolean boolVar1; //declararea unei variabile: specificam tipul de date ce va fi stocat in aceasta variabila in memorie dupa care numele acestei variabile
        boolVar1 = true; //initializare/atribuire a unei valori variabile cu numele boolVar1
        System.out.println("rezultat bolvar1: "+ boolVar1);
        boolVar1 = false;
        System.out.println( "rezultat bolvar1: " + boolVar1);
        boolean bolVar2 = true;
        //boolean boolVar2; nu putem sa declaram mai multe variabile cu acelasi nume in acelasi scop.
        System.out.println( "rezultat bolvar2: " + bolVar2);
        bolVar2 = boolVar1; // -> = atribuie valoare din partea dreapta variabilei din partea stanga
        System.out.println(bolVar2); //false

        //char
        char charVar1;
        charVar1 = 'z'; //este un singur caracter tinut in ghilimele simple.
        System.out.println(charVar1);

        char charVar2 = 'k';
        System.out.println(charVar2);

        //byte
        byte byteVar1 =20;
        System.out.println(byteVar1);
        byteVar1 = 127;
        System.out.println(byteVar1);

        //short
       short shortVar1 = 10000;
       shortVar1 = byteVar1; //putem stoca valori / variabile de tip mai mic , in tip mare fara problema;

        //int
        int intVar1 = 128; //by default valoarile ce apar direct in cod se numesc literali, literali de tip numere intregi sunt by defualt de tip int.
        System.out.println(intVar1);
        intVar1 = shortVar1; // putem stoca valori/variabile de tip mai mic in tip mai mare fara problema!!!
        System.out.println(intVar1);

        long variabila1 = 5000000000000000L; // adaugand L la sfarsitul literalului java va sti acum ca este de tip long si nu de tip int.
        System.out.println(variabila1);
        variabila1 = intVar1;
        System.out.println(variabila1);

        //float -> tip de date cu zecimale
        float floarVar = 5.2f; // literalii de tip numere cu zecimale sunt by default de tip double -> pentru a il face de tip float ii adaug litera f la sfarsit.
        System.out.println(floarVar);

        //double
        double doubleVar;
        doubleVar = 25.58;
        System.out.println(doubleVar);

        doubleVar = variabila1;
        System.out.println(doubleVar);
        variabila1 = (long) doubleVar; // nu putem stoca variabile de tip cu zecimale in variabila tip numar intreg fara conversie explicita (cast)
        System.out.println( "long cast " + variabila1 );
        intVar1 = (int) variabila1; // => inaintea rezultatului/variabilei pun intre paranteze rotunde tipul de data catre care vrea sa convertest adica cel in care voi stoca informatia, in cazul de fata tipul int.
        System.out.println("int " + intVar1);

        int intVar2 = 10;
        long longVar2 = 300000000000L;
        long newVar=longVar2; // evit conversia creend o noua variabila de tipul cel mai mari din care voiam sa convertim.
        intVar2 = (int) longVar2;
        System.out.println(intVar2);




        //scopul variabilelor
        {
            int var1 = 4;
            {
                int var2 = 6;
                {
                    int var3 = 6;
                }
                System.out.println(var2); // e ok aici, inca nu s a terminat blocul de cod in care variabila var2 este declarata, este inca in scop.
            }
            System.out.println(var1); // var1 este inca in scop. Este vizibila, folosibila.
            //            System.out.println(var2); // var2 aici este in afara blocului de cod in care a fost declarata! este in afara scopului.
        }

        //Write a Java program that swaps two variables.(Sa se interschimbe valorile a doua variabile.
        int a = 15;
        int b = 25;
        System.out.println("Vechile valori inainte de interschimbare sunt: ");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        int vecheaValoare = a; //ne am asigurat ca am pastrat valoarea veche a lui a.
         a = b;
         b = vecheaValoare;
        System.out.println("Noile valori dupa interschimabre sunt: ");
        System.out.println("a= " + a);
        System.out.println("b= " + b);









    }


}
