package Game.Warriors;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Peasant extends AbstractUnit {
    public boolean opportunityToGiveShells;

    public Peasant(String name, int x, int y) {
        super(new Position(x, y), name, 3, "sickle" , 10, 0, 1, false);
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public void getHeal() {
        hp += maxHP;
        System.out.println(name + " меня полечили");
    }


    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (hp<=0) return;

        for (AbstractUnit unit : friend){
            if (unit.getInfo().equals("Снайпер") || unit.getInfo().equals("Арбалетчик")){
                if (unit.needSheells() == true){
                    unit.getSheells();
                    return;
                }
            }
        }
    }

    @Override
    public String getInfo() {
        return "Крестьянин";
    }

    @Override
    public boolean needHp() {
        if (this.hp < this.maxHP){
            super.callNeedHp = true;
        }
        return callNeedHp;
    }
}
