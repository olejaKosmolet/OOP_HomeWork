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

    public AbstractUnit(Place position, String name, int armor, String weapon, int hp, int speed, int damage){
        this.position = position;
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.maxHP = this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    public void printInfo() {
        System.out.printf("\nCLASS: %s; NAME: %s; HP: %d; WEAPON: %s; DAMAGE: %d; SPEED: %d; ARMOR: %d; POSITION: "
                + position, className, name, hp, weapon, damage, speed, armor);
    }

    public void getHit(int damage){
        this.hp -= damage;
        if (hp < 0) {
            hp = 0;
/*
            death();
*/
        }
        if (hp > 0) hp = maxHP;
        /*System.out.println(name + " Take dmg");*/
    }

    public double shield(double hp){
        return hp;
    }

    /*public void death(){
        if (this.hp <= 0) {
        }
    }*/

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
        return this.speed;
    }
}