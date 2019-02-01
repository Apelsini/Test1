package class5oop;

public class Zombie extends Enemy {
    static String enemyname;

    public Zombie (int health, String enemyname) {
        super(health);
        this.enemyname = enemyname;
    }

    public void setEnemyname(String enemyname) {
        Zombie.enemyname = enemyname;
    }

    public String getEnemyname() {
        return enemyname;
    }

    public void attackHero(Hero hero) {

        System.out.println(this.getEnemyname() + " прыгает на врага");
        hero.takeDamage(24);
    }

    @Override
    public void takeDamage(int dam) {
        if ((this.getHealth() - dam) > 0) {
            this.setHealth(this.getHealth() - dam);
        } else {
            if (Math.random()>0.5f) {
                this.setHealth(0);
            } else {
                this.setHealth(50); //воскрешение
            }
        }

    }

}
