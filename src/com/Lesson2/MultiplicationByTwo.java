package com.Lesson2;

import java.util.Arrays;

public class MultiplicationByTwo {
    public static void main(String[] args) {
        array_by_two();
    }

    public static void array_by_two() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 7, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
