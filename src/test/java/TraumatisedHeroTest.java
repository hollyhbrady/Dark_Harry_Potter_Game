import character.AfflictionType;
import character.AttackType;
import character.CharacterType;
import character.TraumatisedHero;
import org.junit.Before;
import org.junit.Test;
import rooms.TreasureType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TraumatisedHeroTest {

    private TraumatisedHero HarryPotter;
    private ArrayList<TreasureType> treasureCollection;

    @Before
    public void before(){
        treasureCollection = new ArrayList<>();
        HarryPotter = new TraumatisedHero("Harry Potter",70,50,0.6,"holly-wand", AttackType.EXPELLIRAMUS, AttackType.SLASH, AfflictionType.PTSD, CharacterType.FIGHTER,  treasureCollection);
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
