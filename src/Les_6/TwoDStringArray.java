package Les_6;

//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4(1.1). При подаче массива другого размера
//        необходимо бросить исключение MyArraySizeException(1.2).
//2. Далее метод должен пройтись по всем элементам массива(2.1), преобразовать в int(2.2) и просуммировать(2.3). Если в
// каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно
// быть брошено исключение MyArrayDataException(2.4) с детализацией, в какой именно ячейке лежат неверные данные(2.5).
//
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
//        и вывести результат расчета.


public class TwoDStringArray {
    public static void main(String[] args) {

//        String[][] arr = {
//                {"dog", "cat", "Barsik", "Kesha"}, {"1", "2", "3", "4", "5"}, {"sdfg", "duygsfhaskdj", "siuweiur"}};
        String[][] arrInt = {
                {"1", "2", "2", "4"}, {"1", "3", "483458076", "4"}, {"1", "3", "4", "2"}, {"1", "75747", "2", "4"}};
        try {
            try {
//                int result = twoDString(arr);
                int result1 = twoDString(arrInt);
//                System.out.println(result);
                System.out.println(result1);
            } catch (MyArraySizeException e) {
                System.out.println("Размерность массива не соблюдена!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неверное значение!");
            System.out.println("Ошибка в: " + e.i + "x" + e.j);
        }
    }


    public static int twoDString(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
