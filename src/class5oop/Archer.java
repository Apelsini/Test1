package class5oop;

public class Archer extends Hero {
    public Archer(String name, int dmglvl) {
        super(name, dmglvl);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.println(this.getName() + " стреляет во врага");
        enemy.takeDamage(this.getDamage());
    }
}
