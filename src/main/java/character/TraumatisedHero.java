package character;

import rooms.Room;
import rooms.TreasureType;

import java.util.ArrayList;

public class TraumatisedHero extends Character implements IPerson{


    private AfflictionType afflictionType;
    private CharacterType characterType;
    private ArrayList<TreasureType> treasureCollection;

    public TraumatisedHero(String name, double hP, double cP, double accuracy, String wand,AttackType primaryAttack, AttackType secondaryAttack,  AfflictionType afflictionType, CharacterType characterType, ArrayList treasureCollection) {
        super(name, hP, cP, accuracy, wand, primaryAttack,secondaryAttack);
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
    public String canAttack() {
        return "My therapist says I need to recover, but I all can do is ATTACK!";
    }

    public int getTreasureCollection() {
        return this.treasureCollection.size();
    }
}
