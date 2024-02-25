package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

public class Crossbowman extends AbstractUnit {
    int critDMG;
    int numberOfShells;
    int rangeAttack;

    public Crossbowman(String name, int x, int y) {
        super(x, y, name, 3, "crossbow", 5, 1, 10);
        this.rangeAttack = rangeAttack;
        this.critDMG = critDMG;
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


    // возможно из-за метода расчёта урона не заработает !!!
    @Override
    public void step(List<AbstractUnit> teamNum) {
        if ((hp <= 0) || (numberOfShells == 0)){
            System.out.println("Арбалетчик " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamNum);
        enemy.getHit(this.damage);
        numberOfShells --;
    }
}
