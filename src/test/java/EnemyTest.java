import character.AttackType;
import character.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy voldemort;

    @Before
    public void before(){
        voldemort = new Enemy("Voldemort", 100,80,0.7, "Phoenix Wand", AttackType.AVADAKEDAVRA, AttackType.SECTUMSEMPRA, "MY MUM ABANDONED ME IN A MUGGLE ORPHANAGE!" );
    }

    @Test
    public void canTalk(){
        assertEquals("MY MUM ABANDONED ME IN A MUGGLE ORPHANAGE!", voldemort.canTalk());
    }

    @Test
    public void canMove(){
        assertEquals("I am like a ballerina", voldemort.canMove());
    }

    @Test
    public void canAttack(){
        assertEquals("Die! Die!!", voldemort.canAttack());
    }
}
