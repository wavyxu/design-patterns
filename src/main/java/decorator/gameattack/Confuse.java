package decorator.gameattack;

public class Confuse extends AttackDecorator {

    public Confuse(Attack _action) {
        super(_action);
    }

    @Override
    public void attack(RPGChar attacker, RPGChar defender) {
        defender.confuse();
        super.attack(attacker, defender);
    }
}
