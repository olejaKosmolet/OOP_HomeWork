package Game.Mage;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Monk extends AbstractUnit {
    int mana;

    public Monk(String name, int x, int y) {
        super(new Position(x,y), name, 3, "staff", 50, 1, 0, false);
        this.mana = mana;
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
            if (unit.needHp() && mana > 1){
                mana -= 2;
                unit.getHeal();
            }
        }
        mana ++;
    }

    @Override
    public String getInfo() {
        return "Монах";
    }

    @Override
    public boolean needHp() {
        if (this.hp < this.maxHP){
            super.callNeedHp = true;
        }
        return callNeedHp;
    }
}
