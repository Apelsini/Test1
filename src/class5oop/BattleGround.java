package class5oop;

public class BattleGround {
    public static void main(String[] args) {
        Alien hydra = new Alien(100, "Эрнейская гидра", 20);
        Zombie vampire = new Zombie(100, "Дракула");
        System.out.println(hydra.getEnemyname() + " вошел на поле со здоровьем " + hydra.getHealth() + ".  враг жив? " + hydra.IsAlive());
        System.out.println(vampire.getEnemyname() + " вошел на поле со здоровьем " + vampire.getHealth() + ".  враг жив? " + vampire.IsAlive());

        Archer robin = new Archer(100, "Робин Гуд", 20);
        Wizard healer = new Wizard(100, "Излечитель Нечисти", 12);
        Warrior swordsman = new Warrior(100, "Конан", 25);
        System.out.println(robin.getName() + " прибежал на поле со здоровьем " + robin.getHealth() + " и уроном " + robin.getDamage() + " и он живой? " + robin.IsAlive());
        System.out.println(healer.getName() + " прибежал на поле со здоровьем " + healer.getHealth() + " и уроном " + healer.getDamage() + " и он живой? " + healer.IsAlive());
        System.out.println(swordsman.getName() + " прибежал на поле со здоровьем " + swordsman.getHealth() + " и уроном " + swordsman.getDamage() + " и он живой? " + swordsman.IsAlive());

        robin.attackEnemy(hydra);
        System.out.println(hydra.getEnemyname() + " здоровье врага: " + hydra.getHealth() + " остался жив? " + hydra.IsAlive());

        hydra.attackHero(robin);
        System.out.println(robin.getName() + " после удара имеет здоровье " + robin.getHealth() + " и он живой? " + robin.IsAlive());
        vampire.attackHero(robin);
        System.out.println(robin.getName() + " после удара имеет здоровье " + robin.getHealth() + " и он живой? " + robin.IsAlive());

        vampire.attackHero(healer);
        System.out.println(healer.getName() + " после удара имеет здоровье " + healer.getHealth() + " и он живой? " + healer.IsAlive());

        hydra.attackHero(swordsman);
        System.out.println(swordsman.getName() + " после удара имеет здоровье " + swordsman.getHealth() + " и он живой? " + swordsman.IsAlive());

        System.out.println("==== создаем героев заново ===");
        int whoattacks;
        int whom;
        int beatsback;

        while (hydra.IsAlive() & vampire.IsAlive() & !robin.IsAlive() & !healer.IsAlive() & !swordsman.IsAlive()) {
            whoattacks = (int)Math.round(Math.random()*2);
            whom = (int) Math.round(Math.random());
            beatsback = (int) Math.round(Math.random());



            switch (whoattacks) {
                  case  0:
                if (whom == 0) {
                    robin.attackEnemy(hydra);
                    if (beatsback==0) {hydra.attackHero(robin);}
                } else {
                    robin.attackEnemy(vampire);
                }
                case 1:if (whom == 0) {
                healer.attackEnemy(hydra);
            } else {
                healer.attackEnemy(vampire);
            }
            case 2: if (whom ==0) {
                        swordsman.attackEnemy(hydra);
            } else {
                        swordsman.attackEnemy(vampire);
            }

            }

            System.out.println(robin.getName() + " прибежал на поле со здоровьем " + robin.getHealth() + " и уроном " + robin.getDamage() + " и он живой? " + robin.IsAlive());
            System.out.println(healer.getName() + " прибежал на поле со здоровьем " + healer.getHealth() + " и уроном " + healer.getDamage() + " и он живой? " + healer.IsAlive());
            System.out.println(swordsman.getName() + " прибежал на поле со здоровьем " + swordsman.getHealth() + " и уроном " + swordsman.getDamage() + " и он живой? " + swordsman.IsAlive());
            System.out.println(hydra.getEnemyname() + " вошел на поле со здоровьем " + hydra.getHealth() + ".  враг жив? " + hydra.IsAlive());
            System.out.println(vampire.getEnemyname() + " вошел на поле со здоровьем " + vampire.getHealth() + ".  враг жив? " + vampire.IsAlive());

        }



    }
}
