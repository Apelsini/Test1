package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class PotokChildrenAfterParent {

    public static void main(String[] args) {

        System.err.println("THREAD MAIN() started");

        Thread first = new Thread(() -> {
            System.err.println("THREAD MAIN() has launched thread  FIRST ");
            while (true) {
                System.err.println("sleep 2 seconds.");

                try {

                    Thread.sleep(1000);
                    System.err.println("THREAD FIRST() > SLEEPS 2 sec");


                } catch (InterruptedException ignore) {
                }

                System.err.println("FIRST() - Wake UP");
            }
        });
        /*try {
            Thread.sleep(100);
            printer("main thread", 10);
            System.out.println("THREAD MAIN() > SLEEPS 2.1 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        first.start();
        printer("main thread", 10);
        try {

            printer("first thread", 10);
           first.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.err.println("THREAD MAIN() started after description of thread FIRST");

        System.err.println("THREAD FIRST launched");
        first.interrupt();
        System.err.println("THREAD FIRST interrupted");
    }

    public static void printer(String mes, int count) {
        for (int i = 0; i < count; i++) {
            System.err.println(mes);
        }
    }

}

