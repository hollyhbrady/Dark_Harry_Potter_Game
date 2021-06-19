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
    //    Question why is math random generating two numbers?
    public AttackType chooseAttack(){
        double generate = Math.random();
        System.out.println(generate);
        if (generate <= 0.5){
             return this.getPrimaryAttack();
        } else if(generate > 0.5) {
            return this.getSecondaryAttack();
        }
        return null;

    }
    ;

    @Override
    public double canAttack(Character character, AttackType attack) {

        double health = character.gethP();
//        double damage = random;
//        double damage = this.chooseAttack(random).getAttackPower();
        double result = health - chooseAttack().getAttackPower();
        character.sethP(result);
        return character.gethP();
    }

    public double reduceCP(AttackType attack){
        if(attack == this.getPrimaryAttack()){
            double cpReduce = getcP() - 5;
            setcP(cpReduce);
        } else {
            double cpReduce = getcP() - 3;
            setcP(cpReduce);
        }
        return 0;
    }

    @Override
    public boolean personHpZero(Character character) {
       if(character.gethP() <= 0){
           return true;
       }
       return false;
       }

    }



