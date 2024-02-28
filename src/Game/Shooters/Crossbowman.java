package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Place;

import java.util.List;

public class Crossbowman extends AbstractUnit {
    int critDMG;
    int numberOfShells;
    int rangeAttack;

    public Crossbowman(String name, int x, int y, int critDMG, int numberOfShells) {
        super(new Place(x,y), name, 3, "crossbow", 100, 3, 10);
        this.rangeAttack = rangeAttack;
        this.critDMG = critDMG;
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




    // возможно из-за метода расчёта урона не заработает !!!
    @Override
    public void step(List<AbstractUnit> teamEnemy, List<AbstractUnit> teamFriend) {
        if (this.hp <= 0 || numberOfShells == 0){
            System.out.println("Арбалетчик " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
        numberOfShells --;
    }
}
