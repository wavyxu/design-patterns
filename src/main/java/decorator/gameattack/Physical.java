package decorator.gameattack;

public class Physical implements Attack {
    @Override
    public void attack(RPGChar attacker, RPGChar defender) {
        defender.decreaseHealth(attacker.getStrength());
    }

}
