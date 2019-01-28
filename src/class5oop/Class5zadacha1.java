package class5oop;

public class Class5zadacha1 {
    public static void main(String[] args) {
        /**      TimePromezhutok r = new TimePromezhutok(3661);
         TimePromezhutok r2 = new TimePromezhutok(1, 1, 1);
         System.out.println("инициализация таймкодом ");
         System.out.println(r.sec);
         System.out.println(r.min);
         System.out.println(r.hrs);
         System.out.println("инициализация часами, минутами и секундами ");
         System.out.println(r2.sec);
         System.out.println(r2.min);
         System.out.println(r2.hrs);

         System.out.println(" \"ошибочная\" инициализация 25 часами, 70 минутами и 80 секундами ");
         TimePromezhutok r3 = new TimePromezhutok(25, 70, 80);
         */
        Bankomat b = new Bankomat(0, 0, 0);
        System.out.println("в банкомате двадцаток " + b.getNum20());
        System.out.println("в банкомате пятидесяток " + b.getNum50());
        System.out.println("в банкомате соток " + b.getNum100());

        System.out.println("добавляем денег:");
        b.addmoney(5, 4, 7);
        System.out.println("баланс в банкомате:" + (b.getNum20() * 20 + b.getNum50() * 50 + b.getNum100() * 100));

        System.out.println("в банкомате двадцаток " + b.getNum20());
        System.out.println("в банкомате пятидесяток " + b.getNum50());
        System.out.println("в банкомате соток " + b.getNum100());

        int sum = 180;
        boolean success = b.takemoney(sum);
        System.out.println(" результат операции по снятию суммы " + sum + " = " + success);

        System.out.println("состояние после снятия:");
        System.out.println("в банкомате двадцаток " + b.getNum20());
        System.out.println("в банкомате пятидесяток " + b.getNum50());
        System.out.println("в банкомате соток " + b.getNum100());
    }
}