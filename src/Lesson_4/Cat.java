package Lesson_4;

 class Cat extends Animals{
    public Cat(String name, int swims, int run){
        super(name, swims, run);
    }

    final int maximum_running_distance = 200;

     @Override
     public void run(int running_distance){
         running_distance = 100;
         if (0 < running_distance||running_distance <= maximum_running_distance){
         System.out.println(Cat.name + "пробежал" + running_distance + "метров");
         }
         else {
             System.out.println("Не мучай котика!");
         }

     }

    @Override
    public boolean swims(int length) {
        return false;
    }

}
