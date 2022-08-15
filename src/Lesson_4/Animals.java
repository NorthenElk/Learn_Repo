package Lesson_4;

abstract class Animals {

    private int run_limit;
    private int swim_limit;

    Animals(final int run_limit, final int swim_limit) {
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
    }

    protected boolean run(int distance) {
        return distance <= run_limit;
    }

    protected boolean swim(int distance) {
        return distance <= swim_limit;
    }
}
