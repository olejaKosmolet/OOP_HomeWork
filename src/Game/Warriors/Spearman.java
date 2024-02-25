package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

public class Spearman extends AbstractUnit {
    int force;
    int evasion;
    int protection;

    public Spearman(String name, int x, int y) {
        super(x, y, name, 15, "spear", 15, 2, 10);
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
