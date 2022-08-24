package Les_6;

//Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера
//        необходимо бросить исключение MyArraySizeException.
//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
//        массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено
//        исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//
//В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
//        и вывести результат расчета.

import java.util.Arrays;

public class TwoDStringArray {
    public static void main(String[] args) {
        try {
            twoDStringArray();
        } catch (MyArraySizeException e) {
            System.out.println("Alarm!!!");
            e.printStackTrace();
        }
    }

    public static void twoDStringArray(int[][] arr) {
        arr = new int[4][4];
        System.out.println(Arrays.toString(arr));
    }
}
