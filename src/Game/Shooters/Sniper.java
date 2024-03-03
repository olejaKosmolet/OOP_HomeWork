package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Sniper extends AbstractUnit {
    int dexterity;
    int numberOfShells;
    int rangeAttack;

    public Sniper(String name, int x, int y, int numberOfShells) {
        super(new Position(x, y), name, 2, "rifle" , 50, 3, 2);
        this.numberOfShells = numberOfShells;
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
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {
        if (hp <= 0 || numberOfShells == 0){
            System.out.println("Снайпер " + name + " пал!");
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

}
