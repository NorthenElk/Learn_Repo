package com.Lesson2;

public class PrintString {
    public static void main(String[] args){
    printSameString("attention", 50);
    }
    public static void printSameString(String news, int age){
         news = "attention";
         age = 50;

        for(int i = 0; i < age; i++){
            System.out.println(news + i);
        }
    }
}
