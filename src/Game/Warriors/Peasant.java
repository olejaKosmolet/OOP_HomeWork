package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Peasant extends AbstractUnit {

    public Peasant(String name, int x, int y) {
        super(new Position(x, y), name, 3, "sickle" , 10, 0, 1);
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }


    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (hp<=0) return;

        AbstractUnit target = super.searchForEnemy(enemy);
        if (position.distanceToTarget(target.position) < 2){
            target.getHit(this.damage);
            return;
        }
        Position diff = position.getDifference(target.position);

        Position newposition = new Position(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y)) {
            newposition.x += diff.x < 0 ? 1 : -1;
        }
        else

            newposition.y += diff.y < 0 ? 1 : -1;

        for (AbstractUnit unit : friend) {
            if (unit.position.equals(newposition) && unit.getHp() > 0) return;

        }
        this.position = newposition;

    }

    @Override
    public String getInfo() {
        return "Крестьянин";
    }
}
