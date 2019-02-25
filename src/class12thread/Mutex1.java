package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class Mutex1 {
    private static final Object monitor = new Object();
    //  private static volatile boolean in = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (monitor) {
                //              in = true;
                try {
                    System.err.println("child thread before wait");
                    monitor.wait();
                    //  System.err.println("child thread after wait");
                    monitor.notify();
                } catch (InterruptedException e) {
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {
                //              in = true;
                try {
                    System.err.println("child 2 thread before wait");
                    monitor.wait();
                    //  System.err.println("child 2 thread after wait");
                    monitor.notify();
                } catch (InterruptedException e) {
                }
            }
        }).start();
        //   System.err.println("===parent thread before spinlock");
        while (true) {//spin lock
            // System.err.println("===parent thread spin lock");
            synchronized (monitor) {
                //       System.err.println("===parent thread syncronized");
                monitor.notify();
               Thread.sleep(1000);
                monitor.notify();
                System.err.println("===parent thread NOTIFY");
               // monitor.wait();
            }
       }
//        Thread.sleep(1000);
        //System.err.println("end parent");
    }
}

