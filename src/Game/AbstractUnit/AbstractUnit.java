package Game.AbstractUnit;

import Game.MyInterface.InterfaceStep;
import Game.Place.Position;

import java.util.ArrayList;

public abstract class AbstractUnit implements InterfaceStep{

    protected String name;
    protected int damage;
    protected int armor;
    protected String weapon;
    protected int hp;
    protected  int maxHP;
    protected int speed;
    public String className;
    public Position position;

    public AbstractUnit(Position position, String name, int armor, String weapon, int hp, int speed, int damage){
        this.position = position;
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.maxHP = this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public String toString() {
       return "NAME = " + name + " | \u2665 " + hp + " | ⚔ " + damage + " | \uD83D\uDEE1\uFE0F" + armor;
    }

    public void getHit(int damage){
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        if (hp >= maxHP) hp = maxHP;
    }

    public AbstractUnit searchForEnemy(ArrayList<AbstractUnit> enemyTeam){
        if (enemyTeam.isEmpty()){
            return null;
        }

        AbstractUnit nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (AbstractUnit enemy : enemyTeam){
            if (position.distanceToTarget(enemy.position) < minDistance && getHp() > 0) {
                minDistance = position.distanceToTarget(enemy.position);
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getHp(){
        return hp;
    }

    public String getInfo(){
        return " ";
    }
}