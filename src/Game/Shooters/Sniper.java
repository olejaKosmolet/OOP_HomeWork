package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;

import java.util.List;

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

    @Override
    protected AbstractUnit searchForEnemy(List<AbstractUnit> teamNum, float minDistance){
        AbstractUnit nearestEnemy = null;

        if (teamNum.isEmpty()){
            return null;
        }
// при проверке разницы между дистанцией и минимальным рэнжем атаки добавить && и проверить жив ли таргет
        for (AbstractUnit enemy : teamNum){
            float distance = position.distanceToTarget(enemy.position);
            if (distance < minDistance){
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }

}
