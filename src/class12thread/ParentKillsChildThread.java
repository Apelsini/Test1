package class12thread;

/**
 * Created by user on 22.02.2019.
 */

public class ParentKillsChildThread {
    public static void main(String[] args) throws InterruptedException {
        Thread parent = new Thread(new MyIfiniteRunnable("mesaaga1"));
        parent.start();
        Thread.sleep(200);
        parent.interrupt();

    }
}
