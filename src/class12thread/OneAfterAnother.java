package class12thread;

/**
 * Created by user on 25.02.2019.
 */
public class OneAfterAnother {
    public static void main(String[] args)  throws InterruptedException {
       Thread a = new Thread(new MyMsgRunnable("one", 10, Thread.currentThread()));
       a.start();
        a.join();
        Thread.sleep(2000);
        new Thread(new MyMsgRunnable("two", 10, a)).start();
        Thread.sleep(2000);

    }
}

class MyMsgRunnable implements Runnable {
    public final String msg;
    public final int count;
    public Thread checker;

    public MyMsgRunnable(String msg, int count, Thread checker) {
        this.msg = msg;
        this.count = count;
        this.checker = checker;
    }

    @Override
    public void run() {
       while (checker.isAlive()) {
           for (int i = 0; i <= count; i++) {
               System.err.println(msg);
           }
       }
       }
    }

