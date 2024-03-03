package Game.MyInterface;

import Game.AbstractUnit.AbstractUnit;

import java.util.ArrayList;

public interface InterfaceStep {
    void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend);
}
