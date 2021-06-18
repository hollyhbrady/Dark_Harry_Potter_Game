package character;

public abstract class Character {

    private String name;
    private double hP;
    private double cP;
    private double accuracy;
    private String wand;
    private AttackType primaryAttack;
    private AttackType secondaryAttack;

    public Character(String name, double hP, double cP, double accuracy, String wand, AttackType primaryAttack, AttackType secondaryAttack) {
        this.name = name;
        this.hP = hP;
        this.cP = cP;
        this.accuracy = accuracy;
        this.wand = wand;
        this.primaryAttack = primaryAttack;
        this.secondaryAttack = secondaryAttack;
    }

    public String getName() {
        return name;
    }

    public double getcP() {
        return cP;
    }

    public double gethP() {
        return hP;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public AttackType getPrimaryAttack() {
        return this.primaryAttack;
    }

    public double getPrimaryAttackPower() {
        return this.getPrimaryAttack().getAttackPower();
    }

    public AttackType getSecondaryAttack() {
        return secondaryAttack;
    }

    public String getWand() {
        return wand;
    }

    public void sethP(double hP) {
        this.hP = hP;
    }
}
