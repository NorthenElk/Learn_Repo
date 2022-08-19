package com.Lesson2;

public class FillMassive {
    public static void main(String[] args) {
        createArray();
    }
    public static void createArray(){
        int[] arr = new int[100];
        int counter = 0;
        for (int i = 1; i <= arr.length; i++) {
            counter = counter + 1;
            System.out.print(counter + " ");
        }
        System.out.println();
    }
}
