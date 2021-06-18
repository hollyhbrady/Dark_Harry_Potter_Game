package character;

public class Enemy extends Character implements IPerson {

    private String evilReasoning;

    public Enemy(String name, double hP, double cP, double accuracy, String wand, AttackType primaryAttack, AttackType secondaryAttack, String evilReasoning) {
        super(name, hP, cP, accuracy, wand, primaryAttack, secondaryAttack);
        this.evilReasoning = evilReasoning;
    }

    public String getEvilReasoning() {
        return evilReasoning;
    }

    @Override
    public String canMove() {
        return "I am like a ballerina";
    }

    @Override
    public String canTalk() {
        return this.evilReasoning;
    }

    @Override
    public double canAttack(Character character, AttackType attack) {
        double health = character.gethP();
        double damage = this.chooseAttack(attack).getAttackPower();
        double result = health - damage;
        character.sethP(result);
        return character.gethP();
    }
}
