package class12thread;

/**
 * Created by user on 25.02.2019.
 */
public class Mutex1_pravilnaya {

    private static final Object mutex = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(new MyPrintMsgRunnable("one", 10)).start();
        new Thread(new MyPrintMsgRunnable("two", 10)).start();
      //  printMessage("start!");
    }

    public static void printMessage(final String message) throws InterruptedException {
        synchronized (mutex) {
            System.err.println(message);
            mutex.notify();
            mutex.wait();
            mutex.notify();
        }
    }
}

class MyPrintMsgRunnable implements Runnable {
    public final String msg;
    public final int count;

    public MyPrintMsgRunnable(String msg, int count) {
        this.msg = msg;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i <= count; i++) {
            try {
                Mutex1_pravilnaya.printMessage(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
