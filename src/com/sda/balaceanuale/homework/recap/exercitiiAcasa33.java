package com.sda.balaceanuale.homework.recap;

import java.util.Scanner;

public class exercitiiAcasa33 {
    public static void main(String[] args) {
        //Sa se dezvolte un program ce, cere o nota de la tastatura si afiseaza un mesaj corespunzator pentru nota respectiva
        // -> Se va utiliza instructiunea SWITCH
        //SWITCH
        Scanner scannerGen = new Scanner(System.in);
        System.out.print("Introdu gen, masculin sau feminin ");
        String gen = scannerGen.nextLine();

        switch (gen){
            case "Feminin":
                System.out.println("Este o femeie");
                break;
            case "Masculin":
                System.out.println("Este un barbat");
                break;
            default:
                System.out.println("Ai introdus un gen gresit");
        }




    }
}
