package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;

public class Crossbowman extends AbstractUnit {
    int rechargeSpeed;
    int numberOfShells;
    int rangeAttack;

    public Crossbowman(String name, int x, int y, int rangeAttack) {
        super(x, y, name, 3, "crossbow", 5, 2);
        this.rangeAttack = rangeAttack;
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
