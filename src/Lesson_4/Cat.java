package Lesson_4;

 abstract class Cat extends Animals{
    Cat(int swims, int run){
        super(swims, run);}

    @Override
    public boolean swims(int length) {
        return false;
    }
 }
