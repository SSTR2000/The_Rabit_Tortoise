package main;

public class Race {
    public static void main(String[] args) {
        RacingRabbit rabbit
                = new RacingRabbit
                ("Rabbit");
        RacingTortoise tortoise
                = new RacingTortoise
                ("Tortoise");
        tortoise.start();
//tortoise.interrupt();
        rabbit.start();
        rabbit.interrupt();
    }
}
