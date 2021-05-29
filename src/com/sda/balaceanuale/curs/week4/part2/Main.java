package com.sda.balaceanuale.curs.week4.part2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //In clasa MOUSE am declarat MOUSE ul , apoi l-am initializat

        //Aici ne vom folosii de clasa MOUSE in care am decalarat si initializat MOUSE ul cu o valoare


        Mouse mouse = new Mouse();  // Mouse - clasa, mouse- variabila clasei Mouse =  new Mouse(); creeaza un obiect(mouse ul)
        System.out.println(mouse.name); // printam acel obiect creat adica Mouse ul, aici trebuie sa scriem variabila mouse din clasa
        //MOUSE si in paranteze scriem variabila mouse lui MOUSE si cu .name ii aducem la cunostinta ca ne referim DIRECT
        //la NUMELE ACELUI OBIECT, adica NUMELE MOUSE ului din clasa MOUSE




        // SA PRINTAM ACESTE OBIECTE PUTEM FACE ASA,
        //SEPARAT APELAM CLASA SI PUNCTUL DE REFERINTA AL ACESTEIA, ADICA NUME , SIZE, SAU CE SE MAI CREAZA IN CONSTRUCTOR
        Mouse mouse1 = new Mouse();
        System.out.println(mouse1.name);
        Mouse mouse2 = new Mouse();
        System.out.println(mouse2.size);
        Mouse mouse3 = new Mouse("BatMan", 10, 5);
        System.out.println(mouse3);

        //CA SA ADUNAM ASTEA MAI SIMPLU SA LE PRINTAM ODATA, MERGEM PUTIN IN CLASA MOUSE...
        //AM CREAT FUNCTIA toString in clasa MOUSE si acum ne folosim de acesta aici in METODA MAIN
        // sa PRINTAM TOTUL MAI SIMPLU

        System.out.println(mouse.toString());
        //acesta ne va PRINTA Obiectul MOUSE {name = Jerry, size 1, age 1}
        // PRINTEAZA CLASA+FIELD , adica clasa MOUSE cu FIELD urile name, size si age
        // si TOTODATA printeaza si INITIALIZARILE ACESTUIA adica name JERRY, size 1 si age 1


        // putem folosii deasemnea functia LIST ca sa PRINTAM in forma de LISTA


        List<Mouse> mouseList = Arrays.asList(mouse,mouse1,mouse2,mouse3);
        System.out.println(mouseList);
        //ACESTA VA PRINTA O LISTA CU OBIECTUL ADICA MOUSE
        // PRINT UL VA ARATA ASA:
        //[Mouse{name='Jerry', size=1, age=1}, Mouse{name='Jerry', size=1, age=1}, Mouse{name='Jerry', size=1, age=1}, Mouse{name='BatMan', size=10, age=5}]


        // CA SA NU APARA O LISTA LUNGA CU OBIECTE CA MAI SUS , PUTEM FOLOSI FUNCTIA for
        // for(pentru) ( clasa Mouse "dam un nume"(de ex mouses): mouseList(lista cu MOUSES){
        //printeaza(sout) ( mouses.toString());

        for ( Mouse mosses: mouseList) {
            System.out.println(mosses.toString());
        }


        // ACEASTA LISTA PRINTATA CU FUNCTIA for VA ARATA ASA:
//        Mouse{name='Jerry', size=1, age=1}
//        Mouse{name='Jerry', size=1, age=1}
//        Mouse{name='Jerry', size=1, age=1}
//        Mouse{name='BatMan', size=10, age=5}
//


        // Eu am creat 4 soricei... 3 fiind tripleti si inca un al patrulea soricel
        // tripletii sunt:
        //Mouse{name='Jerry', size=1, age=1}
        //Mouse{name='Jerry', size=1, age=1}
        //Mouse{name='Jerry', size=1, age=1}

        // soricelul special este:
        //Mouse{name='BatMan', size=10, age=5}


    }

}

