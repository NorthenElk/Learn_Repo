package com.Lesson2;

public class Sum {
    public static void main(String[] args) {
        amount(8, 12, 20);
    }

    public static void/*int, if return in the end*/ amount(int a, int b, int sum) {
        a = 8;
        b = 9;
        sum = a + b;
        switch (sum) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println(true);
                break;
            default:
                System.out.println(false);
        }
        /*switch (sum) {
            case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> System.out.println(true);
            default -> System.out.println(false);
        }*/
       /* switch (sum) {
            case 17:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
                System.out.println(true);
            default:
                System.out.println(false);
        }
        return sum;*/
    }
}