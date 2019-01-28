package class5oop;

public class Hero {
   private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println(this.getName()+ " атакует врага");
    }
}
