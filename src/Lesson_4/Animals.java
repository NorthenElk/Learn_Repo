package Lesson_4;

public class Animals {
    String name;

    public Animals(){
    }
    public Animals(String name){
        this.name = name;
    }
    public void animalsInfo(){
        System.out.println("Животное: " + name);
    }
    public void jump(){
        System.out.println("Животное подпрыгнуло");
    }
}
