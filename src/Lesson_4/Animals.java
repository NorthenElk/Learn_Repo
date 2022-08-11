package Lesson_4;

abstract class Animals {
    String name;
    int swims;
    int run;
    public Animals(String name, int swims, int run){
        this.name = name;
        this.swims = swims;
        this.run = run;
    }
    abstract boolean swims(int length);
    abstract void run(int length);
}
