package class5oop;

public class Alien extends Enemy {
    static String enemyname;
    static int healthstep;

    public Alien(int health, String enemyname, int healthstep) {
        super(health);
        this.enemyname = enemyname;
        this.healthstep = healthstep;
    }
    public void setHealthstep(int healthstep) {
        Alien.healthstep = healthstep;
    }

    public int getHealthstep() {
        return healthstep;
    }

    public void setEnemyname(String enemyname) {
        Zombie.enemyname = enemyname;
    }

    public String getEnemyname() {
        return enemyname;
    }

    public void attackHero(Hero hero) {

        System.out.println(this.getEnemyname() + " кусает врага");
        hero.takeDamage(14);
    }

}
