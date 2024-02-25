package Game.Mage;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

public class Monk extends AbstractUnit {
    int mana;
    int rangeHeal;
    int numberOfWordsOfPower;

    public Monk(String name, int x, int y) {
        super(x, y , name, 3, "staff", 5, 1, 10);
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
    public void step(List<AbstractUnit> teamNum){

    }
}
