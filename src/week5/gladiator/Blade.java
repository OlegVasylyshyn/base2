package week5.gladiator;

public class Blade implements Weapon {

    private static final int DAMAGE = 20;

    @Override
    public int bit(int strength) {
        return strength + DAMAGE;
    }
}
