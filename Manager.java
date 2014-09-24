package exthread.bai3;

/**
 *
 * @author MrT
 */
public class Manager implements Runnable {

    private String manager;
    private Task t;

    public Manager(String managername, Task t) {
        this.manager = managername;
        this.t = t;

    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            t.getTask(i);
        }
    }

    public void start() {
        new Thread(this, manager).start();
    }

}
