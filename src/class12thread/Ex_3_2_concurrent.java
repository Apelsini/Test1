package class12thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * Created by user on 27.02.2019.
 */
public class Ex_3_2_concurrent {
    private static volatile int num = 0;
    private static volatile String msg;
    private static  AtomicInteger n = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CustomExecutor myexec = new CustomExecutor(8);
        Runnable printsec = () -> {
            try {
                System.err.println(" thread " + Thread.currentThread().getName() + " " + msg + " " + n);
                Thread.sleep(1000);
                //  n.incrementAndGet();
            } catch (InterruptedException ignore) {
            }
        };

        for (int i = 0; i < 4; i++) {
            n.incrementAndGet();
            myexec.execute(printsec);
        }



        Thread.sleep(3000);
        myexec.shutdown();
    }
}

class CustomExecutor implements Executor {
    private volatile Thread worker;
    private final LinkedBlockingQueue<Runnable> runnables;

    public CustomExecutor(int maxThreadsToRun) {
        this.runnables = new LinkedBlockingQueue<>(maxThreadsToRun);
        this.worker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    Thread thread = new Thread(() -> {
                        try {
                            runnables.take().run();
                        } catch (InterruptedException e) {

                        }
                    });
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        });
        worker.start();
    }

    @Override
    public void execute(Runnable runnable) {
        if (!worker.isInterrupted()) {
            new Thread(() -> {
                try {
                    runnables.put(runnable);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public void shutdown() {
        worker.interrupt();
    }

}
