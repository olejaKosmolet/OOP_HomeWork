package Game.Mage;

import Game.AbstractUnit.AbstractUnit;

public class Witch extends AbstractUnit {
    int mana;
    int rangeAttack;
    int numberOfWordsOfPower;

    public Witch(String name, int x, int y) {
        super(x, y, name, 2, "magic wand", 7, 1);
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
