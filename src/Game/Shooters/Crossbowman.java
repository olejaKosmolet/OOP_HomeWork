package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Crossbowman extends AbstractUnit {
    int numberOfShells;
    int rangeAttack;

    public Crossbowman(String name, int x, int y, int numberOfShells) {
        super(new Position(x,y), name, 3, "crossbow", 50, 3, 3);
        this.rangeAttack = rangeAttack;
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

    // возможно из-за метода расчёта урона не заработает !!!
    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {
        if (getHp() <= 0 || numberOfShells == 0){
            System.out.println("Арбалетчик " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
        numberOfShells --;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}
