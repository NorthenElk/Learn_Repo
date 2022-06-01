package com.Lesson2;

class NumericalPositivity {

    public static void main(String[] args){
        number(0);
    }

    public static void number(int x) {
        x = 0;
        if (x >= 0) {
            System.out.println(x +" Это положительное число!");
        } else {
            System.out.println(x + " - отрицательное число!");
        }
    }

}
