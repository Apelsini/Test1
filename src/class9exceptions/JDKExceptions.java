package class9exceptions;

/**
 * Created by user on 13.02.2019.
 */
public class JDKExceptions {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        try {
            System.out.println(a[5]);
        } catch (RuntimeException r) {

            System.err.println("STRING 1 array exception catched");
            try {
                throw new VirusPetiaException("STRING 2 - MY OWN TEXT HERE:"+r.toString());
            } catch (Exception e){
                System.err.println("STRING 3 array exception catched");
            } finally {
                System.err.println("STRING 4 array exception catched");
                return;
            }

        } finally {
            System.err.println("STRING 5 - FINALLY call");
        }
        System.err.println("STRING 6 - BEYOND the TRY declaration");
    }
}
