package Game.Shooters;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;
import Game.Warriors.Peasant;

import java.util.ArrayList;

public class Crossbowman extends AbstractUnit {
    protected int numberOfShells;
    protected int maxNumberOfShells;

    public Crossbowman(String name, int x, int y, int numberOfShells) {
        super(new Position(x,y), name, 3, "crossbow", 50, 3, 3, false);

        this.numberOfShells = numberOfShells;
        this.maxNumberOfShells = this.numberOfShells = numberOfShells;

    }
    @Override
    public void getSheells() {
        this.numberOfShells++;
        System.out.println(name + " получаю боеприпассы");
    }

    @Override
    public String toString() {
        return super.toString() + " | \u27b6 " + numberOfShells;
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    // возможно из-за метода расчёта урона не заработает !!!
    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {
        if (getHp() <= 0){
            System.out.println("Арбалетчик " + name + " пал!");
            return;
        }
        if (numberOfShells < maxNumberOfShells || numberOfShells <= 0) {
            for (AbstractUnit unit : teamFriend) {
                if (unit.getInfo().equals("Крестьянин") && ((Peasant) unit).opportunityToGiveShells == true) {
                    unit.getSheells();
                    return;
                } else if (numberOfShells <= 0)  {
                    System.out.println(name + " у меня нет боеприпасов!!!");
                    return;
                }
            }
        }
        AbstractUnit enemy = searchForEnemy(teamEnemy);
        enemy.getHit(this.damage);
        numberOfShells --;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public void getResurrection() {
        super.getResurrection();
        System.out.println(name + "  Я ожил !");
    }
}
