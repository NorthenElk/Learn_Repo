package Les_5;


/*public class BoxActions {
    Apple red_apple = new Apple();
    Apple green_apple = new Apple();
    Apple grenny_smith = new Apple();

    Orange afro = new Orange();
    Orange prince_of_the_philippines = new Orange();

    Box<Apple> first_box = new Box<Apple>(red_apple, green_apple, green_apple);
    Box<Orange> second_box = new Box<Orange>(afro, prince_of_the_philippines);

    System.out.println(first_box.compare(second_box));

    Box<Orange> box3 = new Box<Orange>();
    second_box.move(box3);
}*/
public class BoxActions {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.porting(box3);
    }
}