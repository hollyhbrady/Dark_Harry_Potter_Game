import character.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.Character;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
    public void enemyCanAttackHero(){
        AttackType attack = voldemort.chooseAttack();
        double hurtHarry = voldemort.canAttack(HarryPotter, attack);
        assertNotEquals(70,HarryPotter.gethP(), 0.00 );
        System.out.println(HarryPotter.gethP());
    }
//    Question why is math random generating two numbers?

//    @Test
//    public void canAttack(){
//        assertEquals("die die", voldemort.canAttack());
//    }
}
