package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Place;

import java.util.List;

public class Peasant extends AbstractUnit {
    int force;
    int endurance;
    int resistance;

    public Peasant(String name, int x, int y) {
        super(new Place(x, y), name, 3, "sickle" , 10, 0, 10);
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
    public void step(List<AbstractUnit> teamEnemy, List<AbstractUnit> teamFriend){

    }
}
