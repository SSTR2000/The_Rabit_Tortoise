package main;

public class
RacingTortoise extends Thread {
    public RacingTortoise(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName()
                + " has started racing.");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " has passed the oak tree.");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " is at the top of the hill.");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            System.out.println(getName()
                    + " was interrupted.");
        }
        System.out.println(getName()
                + " has finished.");
    }
}
