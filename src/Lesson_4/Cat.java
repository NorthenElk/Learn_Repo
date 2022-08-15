package Lesson_4;

 class Cat extends Animals{
    public Cat(String name, int swims, int run){
        super(name,swims, run);
    }

    @Override
    public boolean swims(int length) {
        return false;
    }

    @Override
    void swim(int length) {

    }

    @Override
    void run(int length) {

    }
}
