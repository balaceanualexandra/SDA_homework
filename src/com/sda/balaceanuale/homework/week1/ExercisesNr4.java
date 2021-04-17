package com.sda.balaceanuale.homework.week1;

public class ExercisesNr4
{

    //Scrieti un program ce declara 3 variabile de tip int si initialieaza 2 dintre ele in momentul declararii.
    //Variabila neinitializata se va initializa ulterior dar inainte de a fi folosita.
    //Se vor afisa cele 3 variabile.
    //Dupa afisare se vor modifica valoarile lor si dupa aceea se vor afisa din nou.
    //Se vor declara inca doua variabile de tip double intr-un bloc de cod separat
    // in interiorul caruia se vor afisa toate variabilele care se afla inca in scop.
    public static void main(String[] args)
    {
        int varInt1 = 10;
        int varInt2 = 20;
        int varInt3;

        varInt3 = 30;

        System.out.println("varInt1=" + varInt1);
        System.out.println();
        System.out.println("varInt2=" + varInt2);
        System.out.println();
        System.out.println("varInt3=" + varInt3);

        varInt1 = 5;
        varInt2 = 55;
        varInt3 = 555;

        System.out.println("varInt1=" + varInt1);
        System.out.println();
        System.out.println("varInt2=" + varInt2);
        System.out.println();
        System.out.println("varInt3=" + varInt3);

        {
            double varDouble1;
            varDouble1 = 10.5;
            double varDouble2;
            varDouble2 = 21.5;
            System.out.println("varInt1=" + varInt1);
            System.out.println();
            System.out.println("varInt2=" + varInt2);
            System.out.println();
            System.out.println("varInt3=" + varInt3);
            System.out.println();
            System.out.println("varDouble1=" + varDouble1);
            System.out.println();
            System.out.println("varDouble2=" + varDouble2);
            System.out.println();
        }
    }
}

