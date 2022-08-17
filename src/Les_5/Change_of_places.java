package Les_5;

import java.util.Arrays;

public class Change_of_places {
    public static void main(String[] args){
        change();
    }
    static void change(){
        Integer[] arr = {4, 456, 4565, 567, 5673, 23256};
        String[] arr1 = {"god", "devil", "demon", "angel", "man", "woman"};

        System.out.println(Arrays.toString(arr));
        ChangeOfPlaces(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr1));
        ChangeOfPlaces(arr1, 0, 5);
        System.out.println(Arrays.toString(arr1));
    }
    private static <T> void ChangeOfPlaces(T[] array, int ind1, int ind2){
        T defolt = array[ind1];

        array[ind1] = array[ind2];

        array[ind2] = defolt;
    }
}