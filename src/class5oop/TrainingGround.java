package class5oop;

public class TrainingGround {
    public static void main(String[] args) {
        Hero player1 = new Hero("Леголас");
        player1.attackEnemy();

        Warrior cpu1 = new Warrior("Смерч");
        cpu1.attackEnemy();

        Wizard cpu2 = new Wizard("Дункан");
        cpu2.attackEnemy();

        Archer cpu3 = new Archer("Леголас");
        cpu3.attackEnemy();
    }
}
