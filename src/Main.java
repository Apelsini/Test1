import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// индейцы
//        int baseyear = 1626;
//        int todayyear = 2019;
//        double r = 0.05;
//        double res = 24;
//        for (int d = 1; d <= (todayyear - baseyear); d++) {
//            res = res * (1 + r);
//        }
//        System.out.println("решение через for");
//        System.out.println("манхэттен стоит примерно " + Math.round(res) + " долл.");
//        System.out.println("решение через рекурсию");
//
//        res = 24;
//        invertRecursively(baseyear, todayyear, r, res);



        // задача 3
//        System.out.println("вычисление факториала");
//          long factor = factfor(6);
//          System.out.println("факториал равен "+factor);
//    factrec(1, 8,1);



    }


    //  factorial через цикл for
    static long ostatokotdelenia(int chislo) {
        if (chislo < 1) {
            System.out.println("введено число меньше 1");
            return -1;
        }
        long rez = 1;
        for (int k = 1; k <= chislo; k++) {
            rez = rez * k;
        }
        return rez;
    }



    //  factorial через цикл for
   static long  factfor(int chislo) {
      if (chislo < 1) {
          System.out.println("введено число меньше 1");
          return -1;
       }
       long rez = 1;
       for (int k = 1; k <= chislo; k++) {
          rez = rez * k;
       }
       return rez;
    }

    //  factorial через рекурсию
    static void factrec(long mnozhitel, long chislo, long rez) {
        if (mnozhitel<(chislo-1)) {
           rez=rez*mnozhitel;
           mnozhitel++;
            factrec(mnozhitel, chislo, rez);
            System.out.println("факториал равен "+rez);
        }
    }

    //recursion
    public static void invertRecursively(int by, int ty, double rr, double re) {
        if (by < ty) {
            re = re * (1 + rr);
            by++;
            invertRecursively(by, ty, rr, re);
        }
        System.out.println("манхэттен стоит примерно " + Math.round(re) + " долл.");
    }




}

