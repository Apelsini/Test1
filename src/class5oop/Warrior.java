package class5oop;

public class Warrior extends Hero {

    public Warrior(int health, String name, int dmglvl) {
        super(health, name, dmglvl);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(this.getName() + " идет на врага");
        enemy.takeDamage(this.getDamage());
    }
}
