package decorator.gameattack;

public abstract class AttackDecorator implements Attack {
    Attack action;
    public AttackDecorator(Attack _action) {
        action = _action;
    }

    @Override
    public void attack(RPGChar attacker, RPGChar defender) {
        action.attack(attacker, defender);
    }
}
