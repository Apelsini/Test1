package class5oop;

public class Wizard extends Hero {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println(this.getName() + " проклинает врага");
        en.takeDamage(-25);
    }
}
