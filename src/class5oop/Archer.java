package class5oop;

public class Archer extends Hero {
    public Archer(int health, String name, int dmglvl) {
        super(health, name, dmglvl);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.println(this.getName() + " стреляет во врага");
        enemy.takeDamage(this.getDamage());
    }


}
