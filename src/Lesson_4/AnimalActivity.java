package Lesson_4;

public class AnimalActivity {
    public static void main(String[] args) {
        Animals[] animal = {new Cat(200,0), new Dog(500, 10)};
        for (Animals an : animal)
            System.out.println(
                    an.getClass().getName() +
                            "\nrun: " + an.run(600) +
                            "\nswim: " + an.swim(15));
    }
}
