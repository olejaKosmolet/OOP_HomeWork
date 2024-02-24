package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;

public class Spearman extends AbstractUnit {
    int force;
    int evasion;
    int protection;

    public Spearman(String name, int x, int y) {
        super(x, y, name, 15, "spear", 15, 7);

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
