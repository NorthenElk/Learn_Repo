package com.company;

class HomeWorkApp {
    public static void main(String [] args) {
        printThreeWords();
        checkSumSign(4, 2, 6);
        printColor(200);
        compareNumbers( 300, -28);
    }
    public static void printThreeWords(){
        System.out.println("Organe\nBanana\nApple");
    }
    public static void checkSumSign (int a, int b, int c){
        a = 4;
        b = 2;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value){
        value = 200;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (0 < value  && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers (int a, int b){
        a =300;
        b = -28;
        if  (a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }
}
