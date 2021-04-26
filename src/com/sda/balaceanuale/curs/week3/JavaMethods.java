package com.sda.balaceanuale.curs.week3;

import java.util.Scanner;

public class JavaMethods
{
    public static void main(String[] args)
    {
        //METODELE IN JAVA
//        int a = 10, b = 5;
//        int suma = a + b;
//        System.out.println(suma);
//
//        a = 2;
//        b = 19;
//        suma = a + b;
        //Daca dorim sa apelam o metoda in cadrul unei metode statice atunci si metoda apelata trebuie la randul sau sa fie statica!
        //Apelam o metoda prin numele acesteia si lista de parametrii pe care aceasta ii are, dand valori acelor parametri.
        System.out.println("Inainte de apelul metodei");
        afiseazaSumaADouaNumere(2, 10); //folosim metodele doar in momentul in care le apelam!
        System.out.println("Dupa apelul metodei");
        //in momentul in care apelam o metoda trebuie sa dam valori varametrilor in exact aceeasi ordine si acelasi tip de data ca la declararea lor in semnatura metodei.
        afiseazaSumaADouaNumere(10, 28);
        int nrInt1 = 20;
        double doubleNr1 = 10.5;
        int nrInt2 = 10;
        System.out.println("Media aritmetica este: " + calculeazaMediaAritmetica(nrInt1, doubleNr1, nrInt2));//trebuie sa dau valori in oridinea in care sunt parametrii la declararea metodei.
        double medieAritmetica = calculeazaMediaAritmetica(4, 8.7, 10); // apel direct cu loterali ca valori ai parametrilor
        System.out.println("Media aritmetica: " + medieAritmetica);
//
//        //apelez metoda afiseazaMeniu():
        afiseazaMeniu();
        int optiuneAleasa = optiuneAleasa();
        System.out.println("S-a ales optiunea " + optiuneAleasa);
        switch (optiuneAleasa)
        {
            case 1:
                System.out.println("bla bla 1");
                break;
            case 2:
                System.out.println("bla bla 2");
                break;
            default:
                System.out.println("Ai ales o potiune invalida!");
        }

        //1. Write a Java program to calculate the average value of array elements. Write from the console.
        //The size of the array is enter from the console
        //Writhe a method to enter the elements of the array
        //Write a method to show the array elements
        //Write a method to calculate the average value of array elements and return to the main method.
        Scanner scannerNumere = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente din array: ");
        int nrElemente = scannerNumere.nextInt();
        double[] doubleArray = new double[nrElemente];
        //afisam elementele initiale ale array-ului
        afisareElemnteArrayDouble(doubleArray);
        //populez array-ul doubleArray
        doubleArray = populareArrayDouble(scannerNumere, doubleArray);
        afisareElemnteArrayDouble(doubleArray);
        System.out.println("Media aritmetica a lui doubleArray este: " + calculeazaMediaAritmeticaDoubleArray(doubleArray));

//        Exercitiul1:
//        Sa se scrie un program ce verifica daca un array contine o anumita valoare citita de la tastatura.
//        Sa se creeze o metoda care primeste ca parametru un array de int si returneaza array-ul cu valorile citite de la tastatura.
//        Se citeste de la tastatura valoarea pe care dorim sa o cautam in array.
//        Se creeaza o metoda care returneaza true daca valoarea a fost gasita in array si false daca valoarea nu a fost gasita in array.
//        Se apeleaza metodele in metoda main pentru a se testa functionalitatea programului.
        System.out.println("START EXERCITIU 1");
        System.out.print("Intorudu numarul de elmente ce se afla in array: ");
        int nrElementeArrayInt = scannerNumere.nextInt();
        int[] intArray = new int[nrElementeArrayInt];
        afisareElementeArrayInt(intArray);
        intArray = populareArrayInt(intArray, scannerNumere);
        afisareElementeArrayInt(intArray);
        System.out.print("Introdu valoare pe care doresti sa o cauti in array: ");
        int valoareCautata = scannerNumere.nextInt();
        boolean valoareGaista = existaValoareaCautataInArrayInt(valoareCautata, intArray);
        if (valoareGaista)
        {
            System.out.println("Valoarea " + valoareCautata + " se afla in array!");
        } else
        {
            System.out.println("Valoarea " + valoareCautata + " nu se afla in array");
        }
    }

    //vom declara o metoda ce va cauta o anumita valoare intr-un array de int si va returna true daca valoare a fost gasita sau flase daca nu a fost gasita
    public static boolean existaValoareaCautataInArrayInt(int valoareCautata, int[] array)
    {
        boolean valoareGasita = false;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == valoareCautata)
            {
                valoareGasita = true;
                break;//opreste rularea unei instructiuni repetitive => opreste for-ul. Facem asta pentru ca am gasit valoarea cautata!Nu are rost sa cautam mai departe!
            }
        }
        return valoareGasita;
    }

    public static double calculeazaMediaAritmeticaDoubleArray(double[] array1)
    {
        double medieAritmeticaArray = 0.0;
        double sumaElementeArray = sumaElementeDoubleArray(array1);
        medieAritmeticaArray = sumaElementeArray / array1.length;
        return medieAritmeticaArray;
    }

    public static double sumaElementeDoubleArray(double[] array2)
    {
        double sum = 0.0;
        for (int i = 0; i < array2.length; i++)
        {
            sum = sum + array2[i];
        }
        return sum;
    }

    //DACA DORIM SA ADUCEM VARIABILE PE CARE SA LE FOLOSIM IN INTERIORUL(BLOCUL DE COD AL UNE METODE) TREBUIE SA LE DAM CA PARAMETRII!!!
    //declaram o metoda ce afiseaza elementele unui array de double primit ca parametru
    public static void afisareElemnteArrayDouble(double[] array)
    {
        System.out.println("Elementele array-ului sunt: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Elementul " + (i + 1) + ": " + array[i]);
        }
    }

    //declaram o metoda ce afiseaza elementele unui array de int primit ca parametru
    public static void afisareElementeArrayInt(int[] array)
    {
        System.out.println("Elementele array-ului sunt: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Elementul " + (i + 1) + ": " + array[i]);
        }
    }


    //declaram o metoda ce atribuie valori elementelor unui array de double uri citind aceste valori de la tastatura
    public static double[] populareArrayDouble(Scanner scanner, double[] array)
    {
        System.out.println("Introdu elementele array-ului:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Inrodu elementul " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    //declaram o metoda ce atribuie valori elementelor unui array de int uri citind aceste valori de la tastatura
    public static int[] populareArrayInt(int[] array, Scanner scanner)
    {
        System.out.println("Introdu elementele array-ului: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Introdu elementul " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Partea de declarare a metodei (semnatura metodei => modul de identificare al metodei in momentul apelarii ei)
    //Regula la declararea metodei:  1.modificator de acces + 2.Optional static + 3.return type + 4. nume_metoda + 5. lista de parametrii () si 6.blocul de cod al metodei.
    //Nu putem declara metode in interiorul altor metode -> doar la nivel de clasa!
    //Putem doar sa apelam metodele (sa le folosim) in interiorul altor merode si nu la nivel de clasa.
    //Putem sa avem orice numar de parametrii dorim si ei sa aiba orice tip!!! inlusiv obiecte si array-uri
    //void nu returneaza nimic
    public static void afiseazaSumaADouaNumere(int a, int b)
    {
        System.out.println("Prima linie de cod din aceasta metoda");
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }

    public static double calculeazaMediaAritmetica(int nr1, double nr2, int nr3)
    {
        double medieAritmetica = (nr1 + nr2 + nr3) / 3;
        return medieAritmetica;
    }

    public static void afiseazaMeniu()
    {
        System.out.println("1.Optiune 1");
        System.out.println("2.Optiune 2");
    }

    public static int optiuneAleasa()
    {
        Scanner scannerNumere = new Scanner(System.in);
        System.out.print("Alege o optiune din meniu: ");
        return scannerNumere.nextInt();
    }

}
