package com.Lesson2;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args){
    arrays();
    }
    public static int[] arrays(){
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== 1){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}