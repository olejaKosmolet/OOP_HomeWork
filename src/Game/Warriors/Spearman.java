package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Spearman extends AbstractUnit {

    public Spearman(String name, int x, int y) {
        super(new Position(x, y), name, 15, "spear", 100, 2, 5);
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (getHp()<=0) return;

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
        return "Фронтлейнер";
    }
}
