package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class FourThreads {
    private static volatile int num = 0;
    private static volatile String msg;

    public static void main(String[] args) throws InterruptedException {

        Runnable printsec = () -> {
            try {
                System.err.println(" string " + num + " " + msg);
                Thread.sleep(500);
            } catch (InterruptedException ignore) {
            }
        };
        num = 0;
        msg = "first message";
        Thread th1 = new Thread(printsec);
        th1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 1;
        msg = "second message";
        Thread th2 = new Thread(printsec);
        th2.start();
            Thread.sleep(1);

        num = 2;
        msg = "third message";
        Thread th3 = new Thread(printsec);
        th3.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 3;
        msg = "fourth message";
        Thread th4 = new Thread(printsec);
        th4.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th1.interrupt();
        th2.interrupt();
        th3.interrupt();
        th4.interrupt();
    }
}
