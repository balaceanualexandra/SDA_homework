package com.sda.balaceanuale.curs.advanced.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static String name;

    public static void a() throws FileNotFoundException {
        b();
    }

    public static void b() throws FileNotFoundException {
        if(true){
            throw new NullPointerException();
        }
        c();
    }

    public static void c() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    public static void main(String[] args) throws FileNotFoundException {

        a();

        try {
            //aici faci ceva periculos care poate arunca exceptii
            //exemplu 1
            int x = 4;
            int y = 0;
//            int[] array = new int[10];
//            array[42]=55;
            int z = x / y;
            System.out.println(z);
        } catch ( RuntimeException  arithmeticException) {
            System.out.println("Aici s-a aruncat arithmeticException ");
        } catch ( Exception arrayIndexOutOfBoundsException) {
            //aici prinzi exceptia in caz ca se arunca una
            System.out.println("Aici s-a aruncat arrayIndexOutOfBoundsException!");
        } finally {
            System.out.println("Am terminat");
        }

        System.out.println("S-a terminat try catch-ul cu bine");
//
//        try {
//            //exemplu 2
//
//            int[] array = new int[10];
//            array[10] = 23;
//            for (int index = 0; index < array.length; index++) {
//                System.out.print(array[index] + " ");
//            }
//        } catch (Exception exception) {
//            System.out.println("Ne pare rau, nu am putut afisa array-ul");
//        }

    }
}
