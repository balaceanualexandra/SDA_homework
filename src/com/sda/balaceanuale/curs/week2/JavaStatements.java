package com.sda.balaceanuale.curs.week2;

import java.util.Scanner;

public class JavaStatements {
    public static void main(String[] args) {
        //INSTRUCTIUNEA SWITCH -> IN expresia din switch putem avea variabila de tip byte, short,char, int si String
        //In literalii(valorile ce apar direct in cod)/variabilele costante(final la declararea variabilei) din case-uri trebuie
        //sa aiba acelasi tip de data cu variabila evaluata in expresia din switch
        //Atentie la breack -> oprest instructiunea switch;
        //Sa se dezvolte un program ce, cere o nota de la tastatura si afiseaza un mesaj corespunzator pentru nota respectiva
        // -> Se va utiliza instructiunea SWITCH
        //SWITCH
        Scanner scannerNumere = new Scanner(System.in);
        System.out.print("Introdu ultima nota luata la un examen: ");
        byte notaIntrodusa = scannerNumere.nextByte();
//
//        //vom stabili setul de valori din case-uri(Ele trebuie sa fie constante):
//        //O variabila final nu mai poate fi modificata!!! atunci folosim cuvantul cheie final in declararea unei variabile!
//        //Trebuie si initializata in momentul declararii o variabila constanta(final).
        final byte nota6 = 6; // ca sa facem o variabila constanta(nu isi poate modifica valoarea) trebuie pus cuvantul cheie final in fata tipului de data.
        final byte aiTrecut = 5;
        final byte nota4 = 4;
        final byte nota2 = 2;

        switch (notaIntrodusa){
            case 10: // folosim literal ce este bu default constant
                System.out.println("Esti ZEU!");
                break; // opreste instructiunea switch si evita executia si a altor case-uri de mai jos.
            case 9: // folosim literal ce este by default constant
                System.out.println("Esti semi-ZEU!");
                break; // opreste instructiunea switch si evita executia si a altor case-uri de mai jos.
            case 8://avem aceeasi logica pentru ambele case-uri si de aceea le putem uni.
            case 7:
                System.out.println("Este o nota buna!");
                break;
            case nota6: //folosim o variabila constanta pentru acest case
                System.out.println("Felicitari! Se poate mai bine!");
                break;
            case aiTrecut:
                System.out.println("Bea o bere! Ai trecut la limita!");
                break;
            case nota4:
            case 3:
            case nota2:
            case 1:
                System.out.println("Este varza! Invata!");
                break;
            default:
                System.out.println("Ai introdu o nota invalida!");
        }
        System.out.println("Se executa prima instructiune dupa instructiunea SWITCH!");
//
//        //IF-ELSE-IF-ELSE -> De lucrat acasa!
//
//        //INSTRUCTIUNEA WHILE -> se executa blocul de cod al instructiunii while cat timp conditia evaluata intre () lui while da true.
//        //Trebuie sa ne asiguram ca, la un moment dat conditia va returna false pentru a evita un loop infinit!!!
//        //pentru asta mereu va trebui sa modificam valoarea variabile sau variabilelor evaluate in conditie.
//        //conditia din instructiunile repetitive se numeste conditie de oprire!
//        //Sa se afiseze toate numerele pare pana la un numar introdus de la tastatura.


        System.out.print("Introdu un numar pana la care doresti sa se afiseze numerele pare: ");
        int nrOprireIntrodus = scannerNumere.nextInt(); //citim de la tastatura numarul pana la care vom afisa numerele pare si il vom salva intr-o variabila pentru utilizarea ulterioara.
        int nr = 0;
        while (nr < nrOprireIntrodus){
            System.out.println(nr);
            nr = nr + 2;
        }
        System.out.println("Prima linie de cod de dupa instructiunea WHILE");
        System.out.println("DE AICI INCEPE EX NR IMPARE");
        //Sa se afiseze toate numerele impare pornind de la un numar introdus de la tastatura pana la un alt numar introdus de la tastatura.
        System.out.print("Introdu numarul de la care vom porni: ");
        int nrPornire = scannerNumere.nextInt();
        System.out.print("Introdu un numar pana la care doresti sa se afiseze numerele impare: ");
        int nrOprire = scannerNumere.nextInt();
        int iteratieCurenta = 1;
        while (nrPornire < nrOprire){ //instructiunea()blocul de cod al) while se poate sa nu se execute nici macar o data daca prima data cand se evalueaza expresia din while returneaza false.
            System.out.println("Nr iteratie: " + iteratieCurenta); //afisam itteratia curenta
            if (nrPornire % 2 != 0){
                System.out.println(nrPornire);
            }else {
                System.out.println("Nr " + nrPornire + " este par nu il afisam"); //daca numarul este par spunem ca nu il afisam! Facam asta doar ca sa se vada mai bine cu afisarea iteratiilor!
            }
            nrPornire++;
            iteratieCurenta++;
        }
        System.out.println("Prima linie de cod dupa instr WHILE");
        //DO-WHILE
//        Exercitiul 4:
//        Scrieti un program care roaga utilizatorul sa introduca numere de la tastatura pana la introducerea unui numar de doua cifre.
//        Sa se calculeze si sa se afiseze produsul numerelor impare divizibile cu 3;
        System.out.println("START EX4 DO-WHILE"); //CA TEMA : SA FACETI SUMA NUMERELOR PARE;
        int nrIntrodus;
        int produs = 1;
        do {
            System.out.print("Introdu un numar de o cifra sau un numar de 2 cifre in cazul in care doresti sa te opresti: ");
            nrIntrodus = scannerNumere.nextInt();
            if (nrIntrodus % 2 != 0 && nrIntrodus % 3 == 0){
                produs = produs * nrIntrodus;
            }
        }while (nrIntrodus < 10);
        System.out.println("Produsul numerelor introduse este: " + produs);
//
//        Exercitiul6:
//        Scrieti un program care citeaste cuvinte de la tastatura pana la apasarea tastei Enter.
//        Sa se construiasca si afiseze o propozitie cu acele cuvinte.
//        Hint: Enter inseamna string gol ("");
//        Pentru verificare ca s a introdus un string gol se va face urmatoarea comparatie "!stringVariable.equals("")". Aceasta expresie ne intoarce true daca valorile Stringurilor sunt identice sau false daca sunt diferite.
//                Exemplu:
//        User input:
//        buna
//        ce
//        mai
//        faci
//        ?
//        enter
//        Java program output:
//        Propozitia creeata este: Buna ce mai faci?

        Scanner scannerText = new Scanner(System.in);
        String cuvantIntrodus;
        String propozitieCreeata = "";
        do {
            System.out.print("Introdu un cuvant sau apasa enter pentru a te opri: ");
            cuvantIntrodus = scannerText.nextLine();
            propozitieCreeata = propozitieCreeata + " " + cuvantIntrodus; //!!!! Cand adunam valoarile stringurilor(textele) operatorul + devine operator de concatenare! Lipeste valorile stringurilor.
        }while (!cuvantIntrodus.equals("")); // "" reprezinta string gol; Stirngurile se compara cu metoda .equals() din clasa String.
        System.out.println("Propozitia creeata este: " + propozitieCreeata);
//
//
//        15. Sa se afiseze urmatorul meniu iar utilizatorul sa aleaga o optiune:
//        Ex int optiuneAleasa = 1;
//
//	            ||   Welcome   ||
//        1.The Sum of numbers.
//        2.The difference between numbers.
//        3.The product of numbers.
//        4.The division of numbers.
//        5.The rest of the division of numbers.
//        6.Exit.
//
//       Se ofera posibilitate utilizatorului sa aleaga din acest meniu cat timp nu introduce optiunea exit. Se va utiliza SWITCH pent a trata optiunile.
        System.out.println("||   Welcome   ||");
        System.out.println("1.The Sum of numbers.");
        System.out.println("2.The difference between numbers.");
        System.out.println("3.The product of numbers.");
        System.out.println("4.The division of numbers.");
        System.out.println("5.The rest of the division of numbers.");
        System.out.println("6.Exit.");
        int optiuneAleasa;
        //DE CONTINUAT VOI ACEST EXERCITIU IN FELUL URMATOR: de terminat pentru fiecare case logica spusa in meniu. La fiecare optiune(case) se vor cere cate 2 numere de la tastatura pentru a se executa functionalitatea meniului.
        do {
            System.out.print("Alege o optiune: ");
            optiuneAleasa = scannerNumere.nextInt();
            switch (optiuneAleasa){
                case 1:
                    System.out.println("Introdu 2 numere pentru a le face suma: ");
                    System.out.print("Nr1: ");
                    int nr1Case1 = scannerNumere.nextInt();
                    System.out.print("Nr2: ");
                    int nr2Case1 = scannerNumere.nextInt();
                    int suma = nr1Case1 + nr2Case1;
                    System.out.println("Suma numerelor este: " + suma);
                    break;
                case 2:
                    System.out.println("S-a ales optiunea 2");
                    break;
                case 3:
                    System.out.println("S-a ales optiunea 3");
                    break;
                case 4:
                    System.out.println("S-a ales optiunea 4");
                    break;
                case 5:
                    System.out.println("S-a ales optiunea 5");
                    break;
                case 6:
                    System.out.println("Multumim ca ati ales serviciile noastre! Va mai asteptam! La revedere :)");
                    break;
                default:
                    System.out.println("Ai ales o optiune invalida! Te rog sa alegi din nou!");
            }
        }while (optiuneAleasa != 6);
    }
}
