package Shooters;
import AbstractUnit.AbstractUnit;

public class Crossbowman extends AbstractUnit {
    int rechargeSpeed;
    int numberOfShells;
    int accuracy;

    public Crossbowman(String name, int armor, String weapon, double hp, int attackSpeed, int rechargeSpeed,
                       int numberOfShells, int accuracy) {
        super(name, 3, "crossbow", hp, attackSpeed);
        this.rechargeSpeed = rechargeSpeed;
        this.numberOfShells = numberOfShells;
        this.accuracy = accuracy;
    }
}
