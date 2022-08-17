package Les_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box (T fruits){
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }
    public void add(T fruits){
        this.fruits.addAll((Arrays.asList(fruits)));
    }
    public static void compare(String[] args){

    }
}
