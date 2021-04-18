package com.sda.balaceanuale.curs.week2;

import java.util.Arrays;
import java.util.Scanner;
public class JavaOperators {
    public static void main(String[] args) {
        //operatori de incrementare/decrementare (++,--)
        int var1 = 3;
        int var2 = var1 + ++var1 - var1-- - var1 + var1++ + ++var1;// 3 + 4 - 4 - 3 + 3 + 5; -> 8
        System.out.println(var2);// 8
        System.out.println(var1);// 5
        ++var1; //va sti sa modifice valoarea stocata in variabila var1
        System.out.println(var1);
        System.out.println(var1++);//6
        System.out.println(var1);//7

        //Valoarea maxima a lui int
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;
        System.out.println(maxVal);
        System.out.println(minVal);

        //operatori relationali (<, <=, >, >=) -> RETURNEAZA O VALOARE DE TIP BOOLEAN TRUE/FALSE
        System.out.println(4 > 3); //true
        System.out.println(4 > 4); // false
        System.out.println(4 >= 4); // true
        System.out.println(19 < 19);// false
        System.out.println(19 <= 19);// true
//        System.out.println(true > true); // nu se poate aplica decat intre numere(intregi si cu zecimale)
        System.out.println("REZULTAT: " + (19 >= 19.0)); // -> converteste timpul mai mic la tip mai mare sau tipul intreg la tipul cu zecimale

        System.out.println("OPERATORI LOGICI DE SCURTCIRCUIT");
        //operatori logici de scurtcircuit (&&, ||) -> RETURNEAZA O VALOARE DE TIP BOOLEAN TRUE/FALSE
        int varInt = 10;
        System.out.println(varInt > 5 && varInt < 11); //T  && T -> T
        System.out.println(varInt > 5 && ++varInt < 11); //T && F -> F
        System.out.println(varInt > 5 && varInt++ < 11); //T && F -> F
        System.out.println(varInt);//12

//        System.out.println(5 && 2); //OPERATORII LOGICI SE APLICA DOAR INTRE VALORI DE TIP BOOLEAN
        varInt = varInt - 2;
        System.out.println(varInt > 5 || varInt < 11);// T -> T pentru ca rezultatul intregii expresii poate fi dat de expresia din stanga => nu se mai evalueaza exp din dreapta
        System.out.println(varInt > 5 || ++varInt < 11);// T // varInt = 10
        System.out.println(varInt > 10 || ++varInt < 11);// F  || F -> F
        System.out.println(varInt); // 11

        System.out.println("EXERCITII CU OPERATORI:");
        //operatorii de egalitate si non egalitate (==,!=)

        //Sa se verifice daca un numar este par;
        int x = 3;
        System.out.println("Numarul " + x + " este par: " + (x % 2 != 1));

        boolean varPar1=    x * 2 == 0;
        boolean varImpar1 = x % 2 != 0;

        //INSTRUCTIUNEA IF-ELSEIF-ELSE
        System.out.println("INSTRUCTIUNEA IF-ELSEIF-ELSE");
        //Sa se afiseze ca numarul este par daca un numar este par;
        int number2 = 11;

        //Daca expresia din parantezele instructiunii if returneaza true atunci se executa blocul si doar blocul instructiunii if;
        //Daca expresia returneaza false atunci nu se va executa blocul instructiunii if;

        if (number2 % 2 == 0) {
            System.out.println("Numarul " + number2 + " este par!");
        } else { //daca expresia din instructiunea if returneaza false atunci se executa blocul de cod al instructiunii else; else nu poate exista fara instructiunea if
            System.out.println("Numarul " + number2 + " este impar!");
        }
        System.out.println("Prima linie de cod dupa instructiunea if");








//        4. Write a program which prints "fizz" if the number is a multiplier of 3, prints "buzz" if
//        its multiplier of 5 and prints "fizzbuzz" if the number is divisible by both 3 and 5.
        int numberFizzProblem = 15; //CONTEAZA URDINEA IN CARE PUNEM CONDITIILE
        if (numberFizzProblem % 3 == 0 && numberFizzProblem % 5 == 0){
            System.out.println("FizzBuzz");
            if (numberFizzProblem % 2 == 0){
                System.out.println("Numarul " + numberFizzProblem + " este par");
            }else {
                System.out.println("Numarul " + numberFizzProblem + " este impar!");
            }
            System.out.println("Prima instructiune dupa if-ul din interiorul if-ului mare");
        }else if (numberFizzProblem % 5 == 0){
            System.out.println("Buzz");
        }else if (numberFizzProblem % 3 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println("Numarul " + numberFizzProblem + " nu este multiplu nici cu 3 si nici cu 5");
        }

        System.out.println("Prima instructiune de cod dupa intreg blocul if-elseif-else");

        if (numberFizzProblem > 100){
            System.out.println("Numarul " + numberFizzProblem + " este mai mare ca 100");
        }
        System.out.println("1");

        //CITIREA DE LA TASTATURA!
        //Avem nevoie de clasa Scanner si sa construim un obiect de tip Scanner. -> trebuie importata din java.Util -> alt+enter si selectam java.Util
        Scanner scannerNumbers = new Scanner(System.in); //scannerNumbers il vom folosi pentru citirea numerelor de la tastatura.
        System.out.print("Introdu un numar intreg de la tastatura: "); //informez utilizatorul ce astept sa introduca de la tastatura!
        int nrCitit1 = scannerNumbers.nextInt(); //salvez ceea ce citesc de la tastatua in variabila nrCitit1 de tip int deoarece apelez metoda ce stie sa scrie un int: nextInt();
        System.out.println("S a introdus numarul: " + nrCitit1);

        System.out.print("Introdu un numar cu zecimale de la tastatura: ");
        double nrCititDouble1 = scannerNumbers.nextDouble(); //citirea unui numar cu zecimale;
        System.out.println("Numarul introdus a fost: " + nrCititDouble1);

        //Citirea unui String(text) de la tastatura:
        Scanner scannerText = new Scanner(System.in);//declar o variabila de tip Scanner cu care voi citi de la tastatura Strging(text);
        System.out.print("Introdu numele tau de la tastatura: ");
        String numeINtrodus = scannerText.nextLine(); // cu ajutorul metodei nextLine() citim text de la tastatura si salvam in variabila cu numele numeIntrodus de tip String.
        System.out.println("La multi ani " + numeINtrodus);

        //Citirea unui caracter de la tastatura:
        System.out.print("Introdu un caracter de la tastatura(litera,cifra,sau caracter special): ");
        char caracterIntrodus = scannerText.nextLine().charAt(0); // luam primul caracter din textul introdus de la tastatura.
        System.out.println("S a introdus caracterul: " + caracterIntrodus);





//        Exercitiul13:
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
        System.out.println("START EX 13:");
        Scanner scannerForTextEx13 = new Scanner(System.in);
        System.out.print("Introdu un caracter de la tastatura (litera,cifra,sau caracter special): ");
        char charIntrodusEx13 = scannerForTextEx13.nextLine().charAt(0); //citim de la tastatura un caracter si il salvam in variabila cu numele charIntrodusEx13 pentru a o folosi ulterior.
        if (charIntrodusEx13 >= '0' && charIntrodusEx13 <= '9'){
            System.out.println("Caracterul intrus " + charIntrodusEx13 + " este cifra");
        }else if(charIntrodusEx13 >= 'a' && charIntrodusEx13 <= 'z'){
            System.out.println("Caraterul introdus " + charIntrodusEx13 + " este litera mica!");
        }else if(charIntrodusEx13 >= 'A' && charIntrodusEx13 <= 'Z'){
            System.out.println("Caraterul introdus " + charIntrodusEx13 + " este litera mare!");
        }else {
            System.out.println("Caracterul " + charIntrodusEx13 + " este caracter special");
        }

    }
}
