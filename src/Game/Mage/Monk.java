package Game.Mage;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Place;

import java.util.List;

public class Monk extends AbstractUnit {
    int mana;
    int rangeHeal;
    int numberOfWordsOfPower;

    public Monk(String name, int x, int y) {
        super(new Place(x,y), name, 3, "staff", 5, 1, -10);
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
        if(this.hp <= 0) return;
        AbstractUnit target = super.searchForEnemy(teamFriend);
        if (position.distanceToTarget(target.position) < 2) {
            target.getHit(this.damage);
            return;
        }

        Place diff = position.difference(target.position);
        Place newPlace = new Place(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y)){
            newPlace.x += (diff.x < 0) ? 1 : -1;
        }
        else {
            newPlace.y += (diff.y < 0) ? 1 : -1;
        }

        for (AbstractUnit unit : teamFriend){
            if (unit.position.equals(newPlace)) return;
        }
        this.position = newPlace;
    }
}
