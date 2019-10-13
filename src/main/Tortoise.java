package main;

public class Tortoise extends Thread {
    public Tortoise(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Tortoise tortoise =
                new Tortoise("Tammy");
        tortoise.start();
    }

    @Override
    public void run() {
        long sleepTime;
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()
                    + " has gone " + (i + 1)
                    + " metres.");
            sleepTime = 2000L;
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                System.out.println
                        (getName() +
                                "was ITR.");
            }
        }
        System.out.println(getName()
                + " has finished.");
    }
}
