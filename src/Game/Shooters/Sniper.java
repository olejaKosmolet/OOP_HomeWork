package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Sniper extends AbstractUnit {
    private int numberOfShells;
    private boolean needSheells;

    public Sniper(String name, int x, int y, int numberOfShells) {
        super(new Position(x, y), name, 2, "rifle" , 50, 3, 2, false);
        this.numberOfShells = numberOfShells;
    }

    @Override
    public boolean needSheells() {
        if (numberOfShells < 1){
            return true;
        }
        else return false;
    }



    @Override
    public String toString() {
        return super.toString() + ", \u27b6 " + numberOfShells;
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public void getSheells() {
        this.numberOfShells++;
        System.out.println(name + " получаю боеприпассы");
    }

    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {
        if (hp <= 0){
            System.out.println("Снайпер " + name + " пал!");
            return;
        }
        if (numberOfShells <= 0) {
            System.out.println("Снайпер " + name +" нет боеприпасов");
            return;
        }

        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
        numberOfShells --;
    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }

    @Override
    public boolean needHp() {
        if (hp < maxHP){
            super.callNeedHp = true;
        }
        return callNeedHp;
    }
}
