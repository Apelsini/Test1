package class12thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
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
      ArrayList<String>  Strings = new ArrayList<>(Arrays.asList("ve","c")) ;
        ReentrantLock reentrantLock = new ReentrantLock;
        ReadWriteLock readwriteLock = new ReadWriteLock() {
            @Override
            public Lock readLock() {
                return null;
            }

            @Override
            public Lock writeLock() {
                return null;
            }
        }


        Scanner scanner = new Sacanner (system.in);
    }
}
