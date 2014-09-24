
package exthread.bai3;

/**
 *
 * @author MrT
 */
public class Worker extends Thread {

    private String threadName;

    private Task t;

    public Worker(String threadName, Task t) {
        this.threadName = threadName;
        this.t = t;

    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            t.setTask();
        }
    }

}
