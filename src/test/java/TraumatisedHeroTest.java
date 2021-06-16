import character.AfflictionType;
import character.AttackType;
import character.CharacterType;
import character.TraumatisedHero;
import org.junit.Before;

import java.util.ArrayList;

public class TraumatisedHeroTest {

    private TraumatisedHero HarryPotter;
    private ArrayList<ArrayList> spells;

    @Before
    public void before(){
        spells = new ArrayList<>();
        HarryPotter = new TraumatisedHero("Steven",70,50,0.6,"wand", spells, AfflictionType.PTSD, CharacterType.FIGHTER, AttackType.EXPELLIRAMUS, AttackType.SLASH);

    }

}
