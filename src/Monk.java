public class Monk extends AbstractUnit{
    int mana;
    int endurance;
    int numberOfWordsOfPower;

    public Monk(String name, int armor, String weapon, double hp, int attackSpeed, int mana,
                int endurance, int numberOfWordsOfPower) {
        super(name, 3, "staff", 5, 2);
        this.mana = mana;
        this.endurance = endurance;
        this.numberOfWordsOfPower = numberOfWordsOfPower;
    }
}
