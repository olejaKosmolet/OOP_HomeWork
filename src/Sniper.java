public class Sniper extends AbstractUnit{
    int dexterity;
    int numberOfShells;
    int accuracy;

    public Sniper(String name, int armor, String weapon, double hp, int attackSpeed, int dexterity, int numberOfShells,
                  int accuracy) {
        super(name, 2, "rifle" , 8, 8);
        this.dexterity = dexterity;
        this.numberOfShells = numberOfShells;
        this.accuracy = accuracy;
    }
}
