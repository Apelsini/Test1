package class9exceptions;


/**
 * Created by user on 13.02.2019.
 */
public class RandomException {
    public static void main(String[] args) {
        int i = (int) Math.round(Math.random()*3);
        int what = (int) Math.round(Math.random()*2);
        int[] a = {1,2};


        try {
          //  int i = (int) Math.random()*3;
            System.out.println("sending Exception No "+i);
           switch (what) {
               case 0: System.out.println(i / 0);
               case 1: System.out.println(a[3]);
               default: i=i/10;
           }
        } catch (RuntimeException r) {
            switch (i) {
                case 0: throw new Error();
                case 1: throw new VirusPetiaException("CASE 1! "+r.getMessage());
                case 2: throw new VirusPetiaException("CASE 2! "+r.toString());
                default: throw new RuntimeException();

            }
        }


    }
}
