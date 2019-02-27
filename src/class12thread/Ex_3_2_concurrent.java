package class12thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


/**
 * Created by user on 27.02.2019.
 */
public class Ex_3_2_concurrent {
    private static volatile int num = 0;
    private static volatile String msg;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CustomExecutor myexec = new CustomExecutor(3);
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
                Runnable printsec = () -> {
            try {
                System.err.println(" thread " + num + " " + msg);
                Thread.sleep(5000);
            } catch (InterruptedException ignore) {
            }
        };
        num = 0;
        msg = "first";

        for (int i = 0; i<5; i++) {
            num = i;
            queue.put(printsec);
        }
myexec.setRunnables(queue);
    }
}

class CustomExecutor implements Executor {
    private int maxThreadsToRun;
    private LinkedBlockingQueue<Runnable> runnables;

    public LinkedBlockingQueue<Runnable> getRunnables() {
        return runnables;
    }

    public void setRunnables(LinkedBlockingQueue<Runnable> runnables) {
        this.runnables = runnables;
    }

    public CustomExecutor(int maxThreadsToRun) {
        this.maxThreadsToRun = maxThreadsToRun;
        this.runnables = new LinkedBlockingQueue<>(maxThreadsToRun);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                  new Thread (runnables.poll()).start();
                }
            }
        }).start();
    }

    @Override
    public void execute(Runnable runnable) {
        try {
            runnables.put(runnable);
        } catch (InterruptedException e) {

        }
    }

}
