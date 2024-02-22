package Warriors;
import AbstractUnit.AbstractUnit;

public class Spearman extends AbstractUnit {
    int force;
    int evasion;
    int protection;

    public Spearman(String name, int armor, String weapon, double hp, int attackSpeed, int force, int evasion,
                    int protection) {
        super(name, 15, "spear", 15, 7);
        this.force = force;
        this.evasion = evasion;
        this.protection = protection;
    }
}
