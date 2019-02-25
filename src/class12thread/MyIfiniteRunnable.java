package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class MyIfiniteRunnable extends MyRunnable {
    public MyIfiniteRunnable(String msg) {
        super(msg);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this.getMsg());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("interrapted");
                return;
            }
        }


        // Thread.currentThread().interrupt();
    }
}
