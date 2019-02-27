package class12thread;
import javax.print.DocFlavor;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * Created by user on 25.02.2019.
 * Родительская нить программы должна считывать вводимые пользователем строки и
 * помещать их в начало связанного списка. Строки длиннее 80 символов можно
 * разрезать на несколько строк. При вводе пустой строки программа должна выдавать
 * текущее состояние списка. Дочерняя нить пробуждается каждые пять секунд и сортирует
 * список в лексикографическом порядке (используйте Collections.sort(...)). Все операции
 * над списком должны синхронизоваться при помощи мьютекса.
 */
public class Ex2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        NumberSecSortable myList = new NumberSecSortable();

        Thread thread = new Thread (() -> {
           while (true) {
               myList.sortStrings();
               try {
                   Thread.sleep(5000);


               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

        });
        thread.start();


        while (true) {
            String str = scanner.next();
            myList.addString(str);

        }

    }
}

class NumberSecSortable {
    private final Object monitor = new Object();

    private List<String> strings = new ArrayList<>();

    void addString (String s) {
        synchronized (monitor) {
            strings.add(s);
        }
    }

    void sortStrings() {
        synchronized (monitor) {
            strings.sort(Comparator.naturalOrder());
            System.out.println(strings);
        }
    }


}

