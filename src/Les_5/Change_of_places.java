package Les_5;

import java.util.Arrays;

public class Change_of_places {
    public static void main(String[] args){
        change();

    }
    static void change(){
        int[] arr = new int[]{4, 456, 4565, 567, 5673, 23256};
        for (int i =0; i <arr.length; i++){
            if (arr[i] == arr[2]){
                arr[i] = arr[4];
            } else if (arr[i] == arr[4]){
                arr[i] = arr[2];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
