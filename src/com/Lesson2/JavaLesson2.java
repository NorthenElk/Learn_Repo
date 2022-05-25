package com.Lesson2;

public class JavaLesson2 {
    public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
        System.out.println(i);
    }

    for (int i = 1; i < 5; i++) {
        for (int j = 1; j < 5; j++) {
            System.out.println("i = " + i + ": j = " + j);
        }
    }
    cikl(3);
}

    public static void cikl(int a) {
        a = 3;
        while (a < 10) { // (true) -- бесконечный цикл
            a++;
            System.out.println(a); // тогда после нужен "break;"
        }
    }
}