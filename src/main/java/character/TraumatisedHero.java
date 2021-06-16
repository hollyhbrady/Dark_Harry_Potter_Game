package character;

import java.util.ArrayList;

public class TraumatisedHero extends Character {

    private ArrayList<ArrayList> spells;
    private String wand;
    private AfflictionType afflictionType;
    private CharacterType characterType;
    private AttackType primaryAttack;
    private AttackType secondaryAttack;


    public TraumatisedHero(String name, double hP, double cP, float accuracy, String wand, AfflictionType afflictionType, CharacterType characterType, AttackType primaryAttack, AttackType secondaryAttack) {
        super(name, hP, cP, accuracy);
        this.spells = new ArrayList<>();
        this.wand = wand;
        this.afflictionType = afflictionType;
        this.characterType = characterType;
        this.primaryAttack = primaryAttack;
        this.secondaryAttack = secondaryAttack;
    }

    public ArrayList<ArrayList> getSpells() {
        return spells;
    }

    public String getWand() {
        return wand;
    }

    public Affliction getAffliction() {
        return affliction;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public AttackType getPrimaryAttack() {
        return primaryAttack;
    }

    public AttackType getSecondaryAttack() {
        return secondaryAttack;
    }
}
