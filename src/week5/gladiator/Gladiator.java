package week5.gladiator;

public abstract class Gladiator {

    protected int health = 100;
    protected String name;

    protected Weapon weapon;

    abstract int bit();
    abstract int defence(int damage);

}
