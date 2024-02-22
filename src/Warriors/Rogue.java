package Warriors;
import AbstractUnit.AbstractUnit;

public class Rogue extends AbstractUnit {
    int dexterity;
    int endurance;
    int evasion;

    public Rogue(String name, int armor, String weapon, double hp, int attackSpeed, int dexterity, int endurance,
                 int evasion) {
        super(name, 6, "knife blade", 13, 10);
        this.dexterity = dexterity;
        this.endurance = endurance;
        this.evasion = evasion;
    }
}
