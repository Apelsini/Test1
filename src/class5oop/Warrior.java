package class5oop;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println(this.getName() + " идет на врага");
        en.takeDamage(-15);
    }
}
