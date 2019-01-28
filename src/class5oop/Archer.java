package class5oop;

public class Archer extends Hero {
    public Archer (String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println(this.getName()+" стреляет во врага");

    }
}
