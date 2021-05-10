package com.sda.balaceanuale.curs.week4.part2;

public class Main {
    public static void main(String[] args) {
        Cellphone phone1 = new Cellphone (5.5, "Apple", "iPhone", true);
        System.out.println(phone1.toString());
        Cellphone phone2 = new Cellphone (3.5, "Samsung", "a", true);
        System.out.println(phone1.call("911"));
        System.out.println(phone1.call("444"));
        System.out.println();

    }
}
