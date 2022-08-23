package com.company;

class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-4, 2);
        printColor(200);
        compareNumbers(300, -28);
    }

    public static void printThreeWords() {
        System.out.println("Organe\nBanana\nApple");
    }

    public static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int num3, int num4) {
        if (num3 >= num4) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
