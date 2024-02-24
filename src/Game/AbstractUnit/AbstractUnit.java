package Game.AbstractUnit;

import Game.MyInterface.MyInterface;
import Game.Place.Place;

import java.util.List;

abstract public class AbstractUnit implements MyInterface {

    public Place position;
    protected String name;
    protected int armor;
    protected String weapon;
    protected double hp;
    protected int attackSpeed;

    public AbstractUnit(int x, int y, String name, int armor, String weapon, double hp, int attackSpeed){
        position = new Place(x, y);
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.hp = hp;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public String toString() {
        return this.name + " " + position.toString();
    }

    protected double attack(int damageMate, double hpEnemy){
    return hpEnemy - damageMate;
    }

    protected double shield(double hp){
        return hp;
    }

    protected double getDmg(double hpMate, int damageEnemy){
        return hp - damageEnemy;
    }

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