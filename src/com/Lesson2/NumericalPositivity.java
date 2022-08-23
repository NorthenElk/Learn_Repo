package com.Lesson2;

class NumericalPositivity {

    public static void main(String[] args) {
        number(0);
        testTern(-5);
        testTern(0);
        testTern(55);
    }

    public static void number(int x) {
        if (x >= 0) {
            System.out.println(x + "- положительное число!");
        } else {
            System.out.println(x + "- отрицательное число!");
        }
    }

    static void testTern(int num) {  // тернарный оператор
        String wrd = (num < 0) ? "отрицательное" : "положительное";
        System.out.printf("%d %s число!%n", num, wrd); // %d-int  %s-str
    }

}
