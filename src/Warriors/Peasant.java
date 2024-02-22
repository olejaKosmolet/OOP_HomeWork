package Warriors;
import AbstractUnit.AbstractUnit;

public class Peasant extends AbstractUnit {
    int force;
    int endurance;
    int resistance;

    public Peasant(String name, int armor, String weapon, double hp, int attackSpeed, int force, int endurance,
                   int resistance) {
        super(name, 3, "sickle" , 10, 3);
        this.force = force;
        this.endurance = endurance;
        this.resistance = resistance;
    }
}
