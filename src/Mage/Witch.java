package Mage;
import AbstractUnit.AbstractUnit;

public class Witch extends AbstractUnit {
    int mana;
    String element;
    int numberOfWordsOfPower;

    public Witch(String name, int armor, String weapon, double hp, int attackSpeed, int mana, String element,
                 int numberOfWordsOfPower) {
        super(name, 2, "magic wand", 7, 1);
        this.mana = mana;
        this.element = element;
        this.numberOfWordsOfPower = numberOfWordsOfPower;
    }
}
