package com.sda.balaceanuale.homework.recap;

import java.util.Locale;

public class ExercitiiMetode {

    public static void main(String[] args) {
        printStop();
        printStop();
        printStop();
        printSomething("copil");
        printSomething("oaie");
        String Amare = toUppercase("apa");
        System.out.println(Amare);

        System.out.println(toUppercase("somn"));

    }

    private static void printStop() {
        System.out.println("STOP");
        System.out.println("stop");
    }

    public static void printSomething(String something){
        System.out.println(something);
    }

    public static String toUppercase(String alfabet) {
        System.out.println(alfabet);
        return alfabet.toUpperCase(Locale.ROOT);
    }



}
