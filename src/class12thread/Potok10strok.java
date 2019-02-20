package class12thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 20.02.2019.
 * Напишите программу, которая создает Thread. Используйте атрибуты по умолчанию.
 * Родительская и вновь созданная нити должны распечатать по десять строк текста.
 */
public class Potok10strok {
    public static volatile int rec = 0;

    public static void main(String[] args) {

        System.out.println("THREAD MAIN()");
        Runnable print1sec = () -> {
            try {
                System.out.println(" string " + rec++);
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        };

        Thread first = new Thread(() -> {
            System.out.println("THREAD MAIN() >  FIRST ");
            rec = rec + 10;
            System.out.println(rec);
            while (rec < 400) {
                System.out.println("sleep 2 seconds.");

                try {
                    Thread.sleep(2000);
                    rec = rec + 30;
                    new Thread(print1sec).start();
                    System.out.println("THREAD MAIN() >  FIRST > PRINT1SEC");
                    System.out.println(rec);
                } catch (InterruptedException ignore) {
                }

                System.out.println("FIRST - Wake UP");
                rec = rec + 50;
                System.out.println(rec);
            }
        });
        first.start();
    }
}
