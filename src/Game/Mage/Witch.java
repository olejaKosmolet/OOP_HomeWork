package Game.Mage;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Witch extends AbstractUnit {

    int mana;


    public Witch(String name, int x, int y) {
        super(new Position(x,y), name, 2, "magic wand", 50, 1, 5, false);
        this.mana = mana;
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {
        if (hp <= 0){
            System.out.println("Ведьмак " + name + " пал!");
            return;
        }
        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
    }
    @Override
    public String getInfo() {
        return "Ведьмак";
    }
}
