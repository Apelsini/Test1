package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class MyRunnable implements Runnable {
    public String getMsg() {
        return msg;
    }

    private final String msg;

    public MyRunnable(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
        //Thread.currentThread().interrupt();
    }
}
