package class5oop;

public abstract class Hero {
   private String name;
   private int damagelevel;

    public Hero(String name, int dmglvl) {
        this.name = name;
        this.damagelevel = dmglvl;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damagelevel;
    }

    abstract void attackEnemy(Enemy en);
}
