package class5oop;

public class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>=0) {
            this.health=health;
        }
    }

    public void takeDamage (int dam) {
        if ((this.getHealth()+dam)>0) {
            this.setHealth(this.getHealth()+dam);
        }

    }


}
