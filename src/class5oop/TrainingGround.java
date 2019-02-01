package class5oop;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy troll = new Enemy(100);
        System.out.println("здоровье врага: " + troll.getHealth());
        System.out.println("враг жив? "+troll.IsAlive());


        Hero cpu1 = new Warrior(100,"Смерч", -55);
        cpu1.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());
        System.out.println("враг жив? "+troll.IsAlive());

        Hero cpu2 = new Wizard(100,"Дункан", -42);
        cpu2.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());
        System.out.println("враг жив? "+troll.IsAlive());

        Hero cpu3 = new Archer(100,"Леголас", -20);
        cpu3.attackEnemy(troll);
        System.out.println("здоровье врага: "+troll.getHealth());
        System.out.println("враг жив? "+troll.IsAlive());

    }
}
