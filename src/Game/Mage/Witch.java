package Game.Mage;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Place;

import java.util.List;

public class Witch extends AbstractUnit {
    int mana;
    int rangeAttack;
    int numberOfWordsOfPower;

    public Witch(String name, int x, int y) {
        super(new Place(x,y), name, 2, "magic wand", 7, 1, 10);
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

    }
}
