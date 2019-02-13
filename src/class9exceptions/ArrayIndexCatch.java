package class9exceptions;

/**
 * Created by user on 13.02.2019.
 */
public class ArrayIndexCatch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        try {
            System.out.println(a[5]);
        } catch (RuntimeException r) {
            System.out.println("array exception catched");
            System.out.println(r);
        }


    }
}
