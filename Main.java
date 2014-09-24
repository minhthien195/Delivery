
package exthread.bai3;

/**
 *
 * @author MrT
 */
public class Main {

    public static void main(String[] args) {
        Task a = new Task();
        Manager m = new Manager("Manager", a);
        m.start();
        Worker w = new Worker("Worker", a);
        w.start();
    }
    
    
}
