import character.AfflictionType;
import character.AttackType;
import character.CharacterType;
import character.TraumatisedHero;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TraumatisedHeroTest {

    private TraumatisedHero HarryPotter;
    private ArrayList<ArrayList> spells;

    @Before
    public void before(){
        spells = new ArrayList<>();
        HarryPotter = new TraumatisedHero("Steven",70,50,0.6,"wand", spells, AfflictionType.PTSD, CharacterType.FIGHTER, AttackType.EXPELLIRAMUS, AttackType.SLASH);

    }

    @Test
    public void heroHasName(){
        assertEquals("Harry Potter", HarryPotter.getName());
    }

    @Test
    public void heroHasHP(){
        assertEquals(70, HarryPotter.gethP(),0.00);
    }

    @Test
    public void heroHasCP(){
        assertEquals(50, HarryPotter.getcP(), 0.0);
    }

    @Test
    public void heroHasAccuracy(){
        assertEquals(0.6, HarryPotter.getAccuracy(), 0.0);
    }

}
