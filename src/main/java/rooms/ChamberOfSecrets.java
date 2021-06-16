package rooms;

import character.Enemy;
import character.TraumatisedHero;

import java.util.ArrayList;

public class ChamberOfSecrets extends Room {
    public ChamberOfSecrets(String name, Enemy enemy, String characteristic, ArrayList treasureCollection, TraumatisedHero traumatisedHero) {
        super(name, enemy, characteristic, treasureCollection, traumatisedHero);
    }


}
