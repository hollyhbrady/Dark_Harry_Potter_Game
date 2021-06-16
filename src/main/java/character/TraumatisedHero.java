package character;

import java.util.ArrayList;

public class TraumatisedHero extends Character implements IPerson{


    private AfflictionType afflictionType;
    private CharacterType characterType;
    private AttackType primaryAttack;
    private AttackType secondaryAttack;

    public TraumatisedHero(String name, double hP, double cP, double accuracy, String wand, AfflictionType afflictionType, CharacterType characterType, AttackType primaryAttack, AttackType secondaryAttack) {
        super(name, hP, cP, accuracy, wand, primaryAttack,secondaryAttack);
        this.afflictionType = afflictionType;
        this.characterType = characterType;
    }

    public AfflictionType getAfflictionType() {
        return afflictionType;
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
