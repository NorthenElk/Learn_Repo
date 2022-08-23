package com.Lesson2;

public class PrintString {
    public static void main(String[] args) {
        printSameString("attention!", 10);
    }

    public static void printSameString(String news, int age) {
        for (int i = 0; i < age; i++) {
            System.out.println(news);
        }
    }
}