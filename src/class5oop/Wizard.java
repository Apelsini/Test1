package class5oop;

public class Wizard extends Hero {
    public Wizard(int health, String name, int dmglvl) {
        super(health, name, dmglvl);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //super.attackEnemy();
        System.out.println(this.getName() + " проклинает врага");
        enemy.takeDamage(this.getDamage());
    }
}
