abstract public class AbstractUnit{
    protected String name;
    protected int armor;
    protected String weapon;
    protected double hp;
    protected int attackSpeed;

    protected AbstractUnit(String name, int armor, String weapon, double hp, int attackSpeed){
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.hp = hp;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

    protected void displayInfo(){
        System.out.printf("Name: %s \tArmor: %s \tWeapon: %s \tHp: %f \tAttackSpeed: %d\n", name, armor, weapon,
                hp, attackSpeed);
    }

    protected double attack(int damageMate, double hpEnemy){
    return hpEnemy - damageMate;
    }

    protected double shield(double hp){
        return hp;
    }

    protected double getDmg(double hpMate, int damageEnemy){
        return hp - damageEnemy;
    }
}