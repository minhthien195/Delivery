
package exthread.bai3;

/**
 *
 * @author MrT
 */
public class Task {

    private int a;
    private int b;
    private boolean flag = true;

    public Task() {
    }

    public synchronized void getTask(int i) {
        try {
            while (!flag) {

                wait();
            }

        } catch (Exception e) {
        }
        this.a = i;
        System.out.println("Manager : " + this.a);
        this.flag = false;
        notify();
        
        

    }

    public synchronized void setTask() {
        try {
            while (flag) {

                wait();
            }
        } catch (Exception e) {
        }
        this.b = this.a;
        System.out.println("Worker : " + this.b);
        flag = true;
        notify();
    }

}
