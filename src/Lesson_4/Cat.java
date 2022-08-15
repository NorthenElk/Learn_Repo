package Lesson_4;

 class Cat extends Animals{
     Cat(int run_limit, int swim_limit) {
     super(run_limit, swim_limit);
 }
     @Override
     protected boolean swim(int distance) {
         return false;
     }
 }
