package week5.gladiator;

public class Arena {

    public void fight() throws InterruptedException {

        Gladiator firstFighter = new Gladiator() {

            @Override
            int bit() {
                return weapon.bit(10);
            }

            @Override
            int defence(int damage) {
                health -= damage;
                return health;
            }
        };
        firstFighter.name = "firstFighter";
        firstFighter.weapon = new Axe();

        Gladiator secondFighter = new Gladiator() {

            @Override
            int bit() {
                return weapon.bit(10);
            }

            @Override
            int defence(int damage) {
                health -= damage;
                return health;
            }
        };
        secondFighter.name = "secondFighter";
        secondFighter.weapon = new Blade();


        while (secondFighter.health > 0 && firstFighter.health > 0) {
            secondFighter.defence(firstFighter.bit());
            firstFighter.defence(secondFighter.bit());

            System.out.println("First fighter has - " + firstFighter.health);
            System.out.println("Second fighter has - " + secondFighter.health);
            Thread.sleep(1_000);
        }

        boolean secondDead = secondFighter.health <= 0;
        boolean firstDead = firstFighter.health <= 0;
        if(firstDead && secondDead){
            System.out.println("DRAW");
        } else if(secondDead) {
            System.out.println("First fighter win");
        } else {
            System.out.println("Second fighter win");
        }

    }

}
