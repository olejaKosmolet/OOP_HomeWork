package Game.AbstractUnit;

import Game.MyInterface.InterfaceStep;
import Game.Place.Place;

import java.util.List;

public abstract class AbstractUnit implements InterfaceStep{

    public Place position;
    protected String name;
    protected int damage;
    protected int armor;
    protected String weapon;
    protected int hp;
    protected  int maxHP;
    protected int speed;
    String className;



    public AbstractUnit(int x, int y, String name, int armor, String weapon, int hp, int speed, int damage){
        this.className = this.getClass().getSimpleName();
        position = new Place(x, y);
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.maxHP = this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    public void print() {
        System.out.printf("\nCLASS: %s; NAME: %s; HP: %d; WEAPON: %s; DAMAGE: %d; SPEED: %d; ARMOR: %d; POSITION: "
                + position + "\n", className, name, hp, weapon, damage, speed, armor);
    }

    public void getHit(float damage){
        hp -= damage;
        if (hp < 0) hp = 0;
        if (hp > 0) hp = maxHP;
    }

    public double shield(double hp){
        return hp;
    }

    public double getDmg(double hpMate, int damageEnemy){
        return hp - damageEnemy;
    }

    public AbstractUnit searchForEnemy(List<AbstractUnit> teamNum){
        if (teamNum.isEmpty()){
            return null;
        }

        AbstractUnit nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (AbstractUnit enemy : teamNum){
            float distance = position.distanceToTarget(enemy.position);
            if (enemy.hp > 0 && distance < minDistance){
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }

    public int getSpeed() {
        return speed;
    }
}