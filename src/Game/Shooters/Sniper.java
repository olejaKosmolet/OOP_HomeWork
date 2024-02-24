package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;

public class Sniper extends AbstractUnit {
    int dexterity;
    int numberOfShells;
    int rangeAttack;

    public Sniper(String name, int x, int y) {
        super(x, y, name, 2, "rifle" , 8, 8);
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
