package class5oop;

public abstract class Hero implements Mortalable {
    private int health;
    private String name;
    private int damagelevel;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void takeDamage(int dam) {
        if ((this.getHealth() - dam) > 0) {
            this.setHealth(this.getHealth() - dam);
        } else {
            this.setHealth(0);
        }

    }

    @Override
    public boolean IsAlive() {
        return (this.getDamage() > 0);
    }


    public Hero(int health, String name, int dmglvl) {
        this.health=health;
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
