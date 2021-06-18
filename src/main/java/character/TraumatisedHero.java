package character;

import rooms.Room;
import rooms.TreasureType;

import java.util.ArrayList;

public class TraumatisedHero extends Character implements IPerson {


    private AfflictionType afflictionType;
    private CharacterType characterType;
    private ArrayList<TreasureType> treasureCollection;

    public TraumatisedHero(String name, double hP, double cP, double accuracy, String wand, AttackType primaryAttack, AttackType secondaryAttack, AfflictionType afflictionType, CharacterType characterType, ArrayList treasureCollection) {
        super(name, hP, cP, accuracy, wand, primaryAttack, secondaryAttack);
        this.afflictionType = afflictionType;
        this.characterType = characterType;
        this.treasureCollection = new ArrayList<>();
    }

    public AfflictionType getAfflictionType() {
        return afflictionType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    @Override
    public String canMove() {
        return "I am moving, look at my traumatised movement";
    }

    @Override
    public String canTalk() {
        return "I am talking, but due to my afflictions it may not be comprehensible";
    }

    @Override
    public double canAttack(Character character, AttackType attack) {
        double health = character.gethP();
        double damage = this.chooseAttack(attack).getAttackPower();
        double result = health - damage;
        character.sethP(result);
        reduceCP(attack);
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

    public int getTreasureCollection() {
        return this.treasureCollection.size();
    }

    public void takeTreasure(Room room, TreasureType treasure) {
        room.removeTreasure(treasure);
        this.treasureCollection.add(treasure);
    }

//    public String checkTreasure(ArrayList treasureCollection){
//        ArrayList stringArray = new ArrayList<>();
//        for (Object treasure : treasureCollection) {
//            stringArray.add(treasure);
////            stringArray.add(" ");
//        }
//        String str = stringArray.toString();
//        return str;
//    }

    public String checkTreasure(ArrayList treasureCollection) {
        String str = treasureCollection.toString();
        return str;
    }

    public double usePerformanceEnhancers(TreasureType drug) {
        if (drug.gethPRestore() > 0) {
            double hPAdjustment = this.gethP() + drug.gethPRestore();
            this.sethP(hPAdjustment);
            treasureCollection.remove(drug);
        } else if
            (drug.getcPRestore() > 0){
            double cPAdjustment = this.getcP() + drug.getcPRestore();
            this.setcP(cPAdjustment);
            treasureCollection.remove(drug);
            }
            return 0;
        }
    }


