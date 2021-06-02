package com.sda.balaceanuale.curs.week4.part2;


    public class Mouse {
        String name = "Tom";
        int size;
        int age;

        //Apoi venim si chemam constructorul, ce spune constructorul asa se va schimba si planul
        //Constructoul se afla in acelasi loc cu planul
        //CONSTRUCTORUL chiar daca returneaza ceva, o valoare, o ceva, NU ARE RETURN TYPE!!!

        public Mouse() {
            name = "Jerry";
            size = 1;
            age = 1;
        }

// De aici , declarand (in field) si initializand (in constructor) , vom apela aceasta clasa, acest program in METODA MAIN!


        public Mouse(String name){
            this.name = name;
        }

        public Mouse(int size){
            this.size=size;

        }

        // constrcutori diferiti, constructor nume, constructor size , pe acestea le putem folosii, apela
        // constructorul public Mouse(int age){this.age = age;} nu poate fi folosit pentru ca NU FACE diferenta dintre
        //CONSTRUCTORUL SIZE SI AGE acestea avand aceeasi valoare.
        //AVEM 2 CONSTRUCTORI CU CATE 1 SINGUR PARAMETRU




        // CONSTRUCTOR CU TOTI PARAMETRII
        //apelat in METODA MAIN acesta RETURNEAZA , OBIECTUL(MOUSE) cu un NUME, un SIZE si un AGE
        public Mouse(String name, int size, int age) {
            this.name = name;
            this.size = size;
            this.age = age;
        }

        // AM RAMAS SA PRINTAM TOTUL SIMPLU IN METODA MAIN,
        // CUM FACEM ASTA?
        // CU FUNCTIA toString , care se numeste @OVERRIDE, click dreapta GENERATE apoi cautam toSTRING


        @Override
        public String toString() {
            return "Mouse{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    ", age=" + age +
                    '}';
        }



    }

