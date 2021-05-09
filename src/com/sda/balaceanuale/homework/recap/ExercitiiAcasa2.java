package com.sda.balaceanuale.homework.recap;

import java.util.Scanner;

public class ExercitiiAcasa2 {
    public static void main(String[] args) {
        // operatori de incrementare / decrementare (++, --)
        int var1 = 3;
        int var2 = var1 + ++var1 - var1-- - var1 + var1++ + ++var1; //3 + 4 -4 -3 + 3 +5 = 8
        System.out.println(var2);// 8
        System.out.println(var1);// 5
        ++var1; //va sti sa modifice valoarea stocata in variabila var1
        System.out.println(var1);//6
        System.out.println(var1++);//6
        System.out.println(var1);//7

        //valoarea maxima
        int maxVal = Integer.MAX_VALUE;
        //VALOAREA MINIMA
        int minVal = Integer.MIN_VALUE;
        System.out.println(maxVal);
        System.out.println(minVal);

        //operatori relationali (<. <=, >, >=) -> returneaza o valoare de tip boolean true / false;
        System.out.println(4 > 3); //true
        System.out.println(4 > 4); //false
        System.out.println(4 >= 4); // true
        System.out.println(19 < 19); // false
        System.out.println(19 <= 19); //true
        // System.out.println(true > true); // nu se poate aplica decat intre numere(intregi si cu zecimale)
        System.out.println("Rezultat: " + (19 >= 19.0));
        System.out.println("OPERATORI LOGICI DE SCURTCIRCUIT");
        //operatori logici de scurtcircuit (&&, ||) -> RETURNEAZA O VALOARE DE TIP BOOLEAN TRUE/FALSE
        int varInt = 10;
        System.out.println(varInt > 5 && varInt < 11);
        System.out.println(varInt > 5 && ++varInt < 11);
        System.out.println(varInt);
        System.out.println(varInt > 5 && varInt++ < 11);
        System.out.println(varInt);
        //        System.out.println(5 && 2); //OPERATORII LOGICI SE APLICA DOAR INTRE VALORI DE TIP BOOLEAN
        varInt = varInt - 2;
        System.out.println(varInt); //10
        System.out.println(varInt > 5 || varInt < 11);
        System.out.println(varInt > 5 || ++varInt < 11);
        System.out.println(varInt); //10
        System.out.println(varInt > 10 || ++varInt < 11);
        System.out.println(varInt); // 11

        System.out.println("EXERCITII CU OPERATORI:");
        //operatorii de egalitate si non egalitate (==,!=)
        // //Sa se verifice daca un numar este par;
        int x = 3;
        System.out.println("Numarul: " + x + " este par: " + (x % 2 != 1));

        boolean varPar1 = x % 2 == 0;
        System.out.println(varPar1);
        boolean varImpar1 = x % 2 != 0;
        System.out.println(varImpar1);
        //INSTRUCTIUNEA IF-ELSEIF-ELSE
        System.out.println("INSTRUCTIUNEA IF-ELSEIF-ELSE");
        //Sa se afiseze ca numarul este par daca un numar este par;
        int number2 = 11;
        //Daca expresia din parantezele instructiunii if returneaza true atunci se executa blocul si doar blocul instructiunii if;
        //Daca expresia returneaza false atunci nu se va executa blocul instructiunii if;

        if (number2 % 2 == 1) {
            System.out.println("Numarul: " + number2 + "este impar");
        } else {
            System.out.println("Numarul " + number2 + " este par!");
        }
        System.out.println("Prima linie de cod dupa instructiunea if");

        //        4. Write a program which prints "fizz" if the number is a multiplier of 3, prints "buzz" if
//        its multiplier of 5 and prints "fizzbuzz" if the number is divisible by both 3 and 5.

        int numberFizzProblem = 120; //CONTEAZA URDINEA IN CARE PUNEM CONDITIILE

        if (numberFizzProblem % 3 == 0 && numberFizzProblem % 5 == 0) {
            System.out.println("Fizzbuzz");
            if (numberFizzProblem % 2 == 0) {
                System.out.println("Numarul " + numberFizzProblem + " este par");

            } else {
                System.out.println("Numarul " + numberFizzProblem + " este impar!");
            }
            System.out.println("Prima instructiune dupa if-ul din interiorul if-ului mare");
        } else if (numberFizzProblem % 5 == 0) {
            System.out.println("Buzz");
        } else if (numberFizzProblem % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Numarul " + numberFizzProblem + " nu este multiplu nici cu 3 si nici cu 5");
        }
        System.out.println("Prima instructiune de cod dupa intreg blocul if-elseif-else");
        if (numberFizzProblem > 100) {
            System.out.println("Numarul " + numberFizzProblem + " este mai mare ca 100");
        }
        System.out.println("1");
        //CITIREA DE LA TASTATURA!
        //Avem nevoie de clasa Scanner si sa construim un obiect de tip Scanner.
        // -> trebuie importata din java.Util -> alt+enter si selectam java.Util

        Scanner scannerNumbers = new Scanner(System.in); //scannerNumbers il vom folosi pentru citirea numerelor de la tastatura.
        System.out.print("Introdu un numar intreg de la tastatura: "); //informez utilizatorul ce astept sa introduca de la tastatura!
        int nrCitit1 = scannerNumbers.nextInt();
        System.out.println("S a introdus numarul: " + nrCitit1);
        System.out.print("Introdu un numar cu zecimale de la tastatura: ");
        double nrCititDouble = scannerNumbers.nextDouble(); ////citirea unui numar cu zecimale;
        System.out.println("Numarul introdus a fost: " + nrCititDouble);

        //Citirea unui String(text) de la tastatura:

        Scanner scannerText = new Scanner(System.in);//declar o variabila de tip Scanner cu care voi citi de la tastatura Strging(text);
        System.out.println("Introdu numele tau de la tastatura: ");
        String numeIntrodus = scannerText.nextLine();
        System.out.println("La multi ani: " + numeIntrodus);
        //Citirea unui caracter de la tastatura:
        System.out.print("Introdu un caracter de la tastatura(litera,cifra,sau caracter special): ");
        char caracterIntrodus = scannerText.nextLine().charAt(0);
        System.out.println("S a introdus caracterul: " + caracterIntrodus);

        Exercitiul13:
//        Sa se scrie un program care verifica daca un caracter introdus de la tastatura este cifra, litera sau caracter special si sa se afiseze un mesaj corespunzator pentru fiecare caz.
//                Hint: Scanner numeVariabilaScanner = new Scanner(System.in);
//        Scanner NU ofera un numeVariabilaScanner.nextChar(). O metoda pentru citirea unui singur caracter de la tastatura.
//                Sa se foloseasca urmatoarea sintaxa:
//        String stringVar = numeVariabilaScanner.nextLine();
//        char charVar = stringVar.charAt(0); //asa se ia prima litera dintr-un String. Vom discuta la partea de OOP cand vom face Stringurile mai in amanunt.
//        Acest charVar sa se verifice daca este litera cifra sau caracter special.
//        HINT:
//        cifra - charVar >= '0' && charVar <= '9'
//        litera - (charVar >= 'a' && charVar <= 'z') ||  (charVar >= 'A' && charVar =< 'Z')
//        caracter special - diferit de cele doua conditii

        System.out.println("Start exercitiul 10.");
        Scanner scannerForTextEx13 = new Scanner(System.in);
        System.out.print("Introdu un caracter de la tastatura (litera,cifra,sau caracter special): ");
        char charIntrodusEx13 = scannerForTextEx13.nextLine().charAt(0);
        if (charIntrodusEx13 >= '0' && charIntrodusEx13 <= '9'){
            System.out.println("Caracterul intrus " + charIntrodusEx13 + " este cifra");
        }
        else if(charIntrodusEx13 >= 'a' && charIntrodusEx13 <= 'z'){
            System.out.println("Caraterul introdus " + charIntrodusEx13 + " este litera mica!");
        }else if(charIntrodusEx13 >= 'A' && charIntrodusEx13 <= 'Z'){
            System.out.println("Caraterul introdus " + charIntrodusEx13 + " este litera mare!");
        }else {
            System.out.println("Caracterul " + charIntrodusEx13 + " este caracter special");
        }












    }


}

