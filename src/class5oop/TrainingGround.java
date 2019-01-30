package class5oop;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy troll = new Enemy(100);
        System.out.println("здоровье врага: " + troll.getHealth());

        Hero cpu1 = new Warrior("Смерч", -55);
        cpu1.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());

        Hero cpu2 = new Wizard("Дункан", -42);
        cpu2.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());

        Hero cpu3 = new Archer("Леголас", -20);
        cpu3.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());

    }
}
