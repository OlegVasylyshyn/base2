package week5.gladiator;

public class Axe implements Weapon {

    private static final int DAMAGE = 30;

    @Override
    public int bit(int strength) {
        return strength + DAMAGE;
    }
}
