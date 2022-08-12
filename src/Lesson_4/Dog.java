package Lesson_4;

class Dog extends Animals{
 public Dog(String name, int swims, int run){
     super(name, swims, run);
    }

    final int maximum_running_distance = 500;
    final int maximum_swimming_distance = 10;

    @Override
    public void run(int running_distance){
        running_distance = 600;
        if (0 <= running_distance || running_distance <= maximum_running_distance){
     System.out.println(Dog.name + "пробежал" + running_distance + "метров");
        } else {
            System.out.println("Укусит");
        }
    }

    @Override
    public boolean swims(int swimming_distance){
        swimming_distance = 10;
        if (0 <= swimming_distance || swimming_distance <= maximum_swimming_distance){
     System.out.println(Dog.name + "проплыл" + swimming_distance + "метров");
        } else {
            System.out.println("Собака убежала от вас");
        }
        return false;
    }
}
