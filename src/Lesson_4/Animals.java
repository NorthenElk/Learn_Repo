package Lesson_4;

abstract class Animals {
    String name;

    public Animals(){
    }
    public Animals(String name){
        this.name = name;
    }
    abstract void swim(int length);
    abstract void run(int length);
}
