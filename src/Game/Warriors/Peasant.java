package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;

public class Peasant extends AbstractUnit {
    int force;
    int endurance;
    int resistance;

    public Peasant(String name, int x, int y) {
        super(x, y, name, 3, "sickle" , 10, 3);

    }
    @Override
    protected double attack(int damageMate, double hpEnemy) {
        return super.attack(damageMate, hpEnemy);
    }

    @Override
    protected double shield(double hp) {
        return super.shield(hp);
    }

    @Override
    protected double getDmg(double hpMate, int damageEnemy) {
        return super.getDmg(hpMate, damageEnemy);
    }
}
