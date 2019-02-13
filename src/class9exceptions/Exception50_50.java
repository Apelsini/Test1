package class9exceptions;

/**
 * Created by user on 13.02.2019.
 */
public class Exception50_50 {
    public static void main(String[] args) {
        int[] a = {1,2};
        int what = (int) Math.round(Math.random()*1);

        try {
            if (what==0) {
                System.err.println(a[1]);
            } else {
                System.err.println(a[3]);
            }

        } catch (RuntimeException r) {
            System.err.println("array exception catched");
            System.err.println(r);
        } finally {
            System.err.println("FINALLY exit");
        }

    }
}
