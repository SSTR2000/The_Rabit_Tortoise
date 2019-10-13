package main;

public class RacingRabit
        extends Thread {
    public RacingRabit(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName()
                + " has started racing.");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " has passed the oak tree.");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " is at the top " +
                "of the hill and " +
                "is falling asleep.");
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " has finished.");
    }
}
