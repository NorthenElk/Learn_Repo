package com.Lesson2;

public class DiagonalUnits {
    public static void main(String[] args) {
        two_Dimensional_Array();
    }

    public static void two_Dimensional_Array() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}