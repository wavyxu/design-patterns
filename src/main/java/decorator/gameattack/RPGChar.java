package decorator.gameattack;

public class RPGChar {
    private int strength, health;
    private boolean confused = false;

    public RPGChar(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }
    public int getStrength() { return strength; }
    public void decreaseHealth(int loss) { health -= loss; }
    public void confuse() { confused = true; }

}
