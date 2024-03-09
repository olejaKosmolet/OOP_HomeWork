package Game.Mage;

import Game.AbstractUnit.AbstractUnit;
import Game.Place.Position;

import java.util.ArrayList;

public class Witch extends AbstractUnit {

    protected int mana;
    protected int maxMana;

    protected boolean flag;


    public Witch(String name, int x, int y, int mana) {
        super(new Position(x,y), name, 2, "magic wand", 50, 1, 0, false);
        this.mana = mana;
        this.maxMana = this.mana = mana;
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public String toString() {
        return super.toString() + " | ☯ " + mana;
    }

    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (getHp() <= 0) return;

        ArrayList<AbstractUnit> sortlist = new ArrayList<>(friend);
        ArrayList<AbstractUnit> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());

        int countAtRest = 0;

        for (AbstractUnit unit : sortlist) {
            if (unit.getHp() == 0) {
                deadlist.add(unit);
                countAtRest++;
            }
        }
        if (deadlist.size() >= 3){
            flag = true;
            System.out.println("Флаг установлен");
        }
        if (flag && mana == 10){
            deadlist.getFirst().getResurrection();
            mana = 0;
            System.out.println("Воскресил: " + deadlist.getFirst().getName());
            flag = false;
            return;
        }

        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        sortlist.getFirst().getHeal();
        mana -= 2;
    }

    @Override
    public String getInfo() {
        return "Ведьмак";
    }

    @Override
    public void getResurrection() {
        getResurrection();
        System.out.println(name + "  Я ожил !");
    }

}
