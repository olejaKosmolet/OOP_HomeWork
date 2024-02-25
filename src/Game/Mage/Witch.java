package Game.Mage;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

public class Witch extends AbstractUnit {
    int mana;
    int rangeAttack;
    int numberOfWordsOfPower;

    public Witch(String name, int x, int y) {
        super(x, y, name, 2, "magic wand", 7, 1, 10);
    }

    @Override
    public void getHit(float damage) {
        super.getHit(damage);
    }

    @Override
    public double shield(double hp) {
        return super.shield(hp);
    }

    @Override
    public double getDmg(double hpMate, int damageEnemy) {
        return super.getDmg(hpMate, damageEnemy);
    }


    @Override
    public void step(List<AbstractUnit> teamNum) {

    }
}
