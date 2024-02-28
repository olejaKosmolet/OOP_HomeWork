package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Place;

import java.util.List;

public class Sniper extends AbstractUnit {
    int dexterity;
    int numberOfShells;
    int rangeAttack;

    public Sniper(String name, int x, int y, int numberOfShells) {
        super(new Place(x, y), name, 2, "rifle" , 100, 3, 10);
        this.numberOfShells = numberOfShells;
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public double shield(double hp) {
        return super.shield(hp);
    }

    @Override
    public void step(List<AbstractUnit> teamEnemy, List<AbstractUnit> teamFriend) {
        if ((hp <= 0) || (numberOfShells == 0)){
            System.out.println("Снайпер " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
        numberOfShells --;
    }
}
