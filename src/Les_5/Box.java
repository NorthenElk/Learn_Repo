package Les_5;

import java.util.ArrayList;
import java.util.Arrays;

/*public class Box<T extends Fruit> {

    private ArrayList<T> items;

    public Box (T items){
        this.items = new ArrayList<>(Arrays.asList(items));
    }
    public void add(T items){
        this.items.addAll((Arrays.asList(items)));
    }
    public void remove(T items){
        for (T item: items) this.items.remove(item);
    }
    public ArrayList<T> getFruits(){
        return new ArrayList<>(items);
    }
    public void clear(){
        items.clear();
    }

    float getWeight(){
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T fruit: items) weight += fruit.getWeight();
        return weight;
    }
    public boolean compare(Box){
        return this.getWeight() == box.getWeight();
    }
    public void move(Box<? super T> box){
        box.items.addAll(this.items);
        clear();
    }
}*/

public class Box<T extends Fruit> {
    private final ArrayList<T> items;

    @SafeVarargs
    public Box(T... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
    }

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T item: items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void porting(Box<? super T> box) {
        box.items.addAll(this.items);
        clear();
    }
}
