package Lesson_4;

abstract class Animals {
    static String name;
    int swims;
    final int maximum_running_distance = 0;
    int run;
    final int maximum_swimming_distance = 0;

    public Animals(String name, int swims, int run){
        this.name = name;
        this.swims = swims;
        this.run = run;
    }
    abstract boolean swims(int swimming_distance);
    abstract void run(int running_distance);
}
