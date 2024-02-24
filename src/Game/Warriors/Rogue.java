package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;

public class Rogue extends AbstractUnit {
    int dexterity;
    int endurance;
    int evasion;

    public Rogue(String name, int x, int y) {
        super(x, y, name, 6, "knife blade", 13, 10);
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
