import character.*;
import org.junit.Before;
import org.junit.Test;
import rooms.ChamberOfSecrets;
import rooms.Room;
import rooms.TreasureType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ChamberOfSecretsTest {

    private ChamberOfSecrets chamberOfSecrets;
    private Enemy basilisk;
    private TreasureType treasureType;
    private ArrayList<TreasureType> treasureHoard;
    private TreasureType ring;
    private ArrayList<TreasureType> treasureCollection;
    private TraumatisedHero HarryPotter;
    private AfflictionType roomAffliction;
    private TreasureType tiara;

    @Before
    public void before(){
        roomAffliction = AfflictionType.PTSD;
        ring = TreasureType.GAUNTSRING;
        HarryPotter = new TraumatisedHero("Harry Potter",70,50,0.6,"holly-wand", AttackType.EXPELLIRAMUS, AttackType.SLASH, AfflictionType.PTSD, CharacterType.FIGHTER,  treasureCollection);
        treasureHoard = new ArrayList<TreasureType>();
        basilisk = new Enemy("Basilisk",70,60,0.5,"Who needs a wand pussies?", AttackType.BITE, AttackType.PETRIFY, "I am a snakey snake!");
        chamberOfSecrets = new ChamberOfSecrets("Chamber of Secrets", basilisk, "Wet, slimy and has a great bloody snek!", treasureHoard, HarryPotter, roomAffliction);
    }

    @Test
    public void roomHasName(){
        assertEquals("Chamber of Secrets", chamberOfSecrets.getName());
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(basilisk, chamberOfSecrets.getEnemy());
    }

    @Test
    public void roomHasCharacteristic(){
        assertEquals("Wet, slimy and has a great bloody snek!", chamberOfSecrets.getCharacteristic());
    }

    @Test
    public void roomHasHero(){
        assertEquals(HarryPotter, chamberOfSecrets.getTraumatisedHero());
    }

    @Test
    public void roomDoesntHaveTreasure(){
        assertEquals(0, chamberOfSecrets.getTreasure().size());
    }

    @Test
    public void roomHasTreasure(){
        chamberOfSecrets.addTreasure(ring);
        assertEquals(1, chamberOfSecrets.getTreasure().size());
    }
    @Test
    public void roomCanRemoveTreasure(){
        chamberOfSecrets.addTreasure(ring);
        chamberOfSecrets.addTreasure(tiara);
        basilisk.sethP(0);
        chamberOfSecrets.removeTreasure(basilisk);
        assertEquals(0, chamberOfSecrets.getTreasure().size());
        assertEquals(2, HarryPotter.getTreasureCollection());
        System.out.println(chamberOfSecrets.getTreasure().size());
        System.out.println(HarryPotter.getTreasureCollection());

    }
//
//    @Test
//    public void traumatisedHeroCanTakeTreasureFromRoom(){
//        chamberOfSecrets.addTreasure(ring);
//        HarryPotter.takeTreasure(chamberOfSecrets,ring);
//        assertEquals(0, chamberOfSecrets.getTreasure().size());
//        assertEquals(1,HarryPotter.getTreasureCollection());
//    }

    @Test
    public void HeroAndEnemyCanFightPrimary(){
        AttackType damage = AttackType.EXPELLIRAMUS;
        HarryPotter.canAttack(basilisk, damage);
        assertEquals(50, basilisk.gethP(), 0.0);
        assertEquals(45, HarryPotter.getcP(), 0.0);
        System.out.println(HarryPotter.getcP());
    }

    @Test
    public void HeroAndEnemyCanFightSecondary(){
        AttackType damage = AttackType.SLASH;
        HarryPotter.canAttack(basilisk, damage);
        assertEquals(40, basilisk.gethP(), 0.0);
        assertEquals(47, HarryPotter.getcP(), 0.0);
        System.out.println(HarryPotter.getcP());
    }

    @Test
    public void canGetRoomAffliction(){
        assertEquals(AfflictionType.PTSD, chamberOfSecrets.getRoomAffliction());
    }

    @Test
    public void roomCanAfflictHero(){
        chamberOfSecrets.afflictHero(HarryPotter);
        assertEquals(40, HarryPotter.getcP(), 0.00);
    }



}
