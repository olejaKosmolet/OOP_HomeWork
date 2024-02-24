package Game.Mage;

import Game.AbstractUnit.AbstractUnit;

public class Monk extends AbstractUnit {
    int mana;
    int rangeHeal;
    int numberOfWordsOfPower;

    public Monk(String name, int x, int y) {
        super(x, y , name, 3, "staff", 5, 2);
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
