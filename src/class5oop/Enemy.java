package class5oop;

public class Enemy implements Mortalable {
    @Override
    public boolean IsAlive() {
        return (this.getHealth() > 0);
    }

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    public void takeDamage(int dam) {
        if ((this.getHealth() - dam) > 0) {
            this.setHealth(this.getHealth() - dam);
        } else {
            this.setHealth(0);
        }

    }


}
