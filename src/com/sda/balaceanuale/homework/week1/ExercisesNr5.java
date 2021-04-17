package com.sda.balaceanuale.homework.week1;

public class ExercisesNr5
{

    //5.Sa se declare si initializeze cate o variabila de orice tip(la alegere)
    // in cate un bloc de cod separat in interiorul metodei
    // main si sa se afiseze fiecare variabila
    // in toate blocurile de cod unde este in scop(vizibila/folosibila).
    public static void main(String[] args)
    {

        int varInt1 = 90;
        char varChar1 = 'c';

        {
            double varDouble1 = 0.5;
            String varString1 = "Cloud.";
            System.out.println("varDouble1=" + varDouble1);
            System.out.println();
            System.out.println("varString1=" + varString1);
            System.out.println();


            System.out.println("varInt1=" + varInt1);
            System.out.println();
            System.out.println("varChar1=" + varChar1);
            System.out.println();
        }

        System.out.println("varInt1=" + varInt1);
        System.out.println();
        System.out.println("varChar1=" + varChar1);
        System.out.println();
    }
}


