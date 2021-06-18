package rooms;

import character.AfflictionType;
import character.Enemy;
import character.TraumatisedHero;

import java.util.ArrayList;

public class ChamberOfSecrets extends Room {
    public ChamberOfSecrets(String name, Enemy enemy, String characteristic, ArrayList treasureCollection, TraumatisedHero traumatisedHero, AfflictionType roomAffliction) {
        super(name, enemy, characteristic, treasureCollection, traumatisedHero, roomAffliction);
    }


}
