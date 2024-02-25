package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

public class Sniper extends AbstractUnit {
    int dexterity;
    int numberOfShells;
    int rangeAttack;

    public Sniper(String name, int x, int y) {
        super(x, y, name, 2, "rifle" , 8, 3, 10);
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
        if ((hp <= 0) || (numberOfShells == 0)){
            System.out.println("Арбалетчик " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamNum);
        enemy.getHit(this.damage);
    }
}
