package class5oop;

public class Bankomat {
    private int num20;
    private int num50;
    private int num100;

    public Bankomat(int initnum20, int initnum50, int initnum100) {
        this.setNum20(initnum20);
        this.setNum50(initnum50);
        this.setNum100(initnum100);
    }

    public void setNum20(int num20) {
        if (num20 >= 0) {
            this.num20 = num20;
        }
    }

    public void setNum50(int num50) {
        if (num50 >= 0) {
            this.num50 = num50;
        }
    }

    public void setNum100(int num100) {
        if (num100 >= 0) {
            this.num100 = num100;
        }
    }

    public int getNum20() {
        return num20;
    }

    public int getNum50() {
        return num50;
    }

    public int getNum100() {
        return num100;
    }

    public void addmoney(int add20, int add50, int add100) {
        this.setNum20(this.getNum20() + add20);
        this.setNum50(this.getNum50() + add50);
        this.setNum100(this.getNum100() + add100);
    }

    public boolean takemoney(int summa) {
        // 160 = 8   3   1        8*20=160   3*50=150  1*100=100
        // 160+150+100 = 410
        // 410-160 = 250
        // 160
        int rest = summa;
        boolean success = false;
        if ((summa > 20)&(summa<(this.getNum20()*20+this.getNum50()*50+this.getNum100()*100))) {
            int num100 = Math.floorDiv(rest, 100);
            if (this.getNum100() > 0) {
                rest = rest - num100 * 100;
            }
            int num50 = Math.floorDiv(rest, 50);
            if (this.getNum50() > 0) {
                rest = rest - num50 * 50;
            }
            int num20 = Math.floorDiv(rest, 20);
            if (this.getNum20() > 0) {
                rest = rest - num20 * 20;
            }

        }
        if (rest == 0) {
            success = true;
            this.addmoney(0, 0, -num100);
            this.addmoney(0, -num50, 0);
            this.addmoney(-num20, 0, 0);
        }
        return success;
    }
}
