package com.sda.balaceanuale.homework.recap;

public class ExercitiiArray {
    public static void main(String[] args) {
        // Un ARRAY DE INT cu dimensiunea 5;
        int[] arrayInt = new int[5];
        arrayInt[0] = 1;
        arrayInt[1] = 4;
        arrayInt[2] = 7;
        arrayInt[3] = 8;
        arrayInt[4] = 9;

        for (int index = 0; index < arrayInt.length; index++) {
            System.out.println("Elementul " + index + ": " + arrayInt[index]);
        }

        for (int element: arrayInt){
            System.out.println(element);
        }


    }
}
