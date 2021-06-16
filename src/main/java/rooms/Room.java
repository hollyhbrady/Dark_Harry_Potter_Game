package rooms;

import character.Enemy;
import character.TraumatisedHero;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Enemy enemy;
    private String characteristic;
    private ArrayList<TreasureType> treasureCollection;
    private TraumatisedHero traumatisedHero;

    public Room(String name, Enemy enemy, String characteristic, ArrayList treasureCollection, TraumatisedHero traumatisedHero){
        this.name = name;
        this.enemy = enemy;
        this.characteristic = characteristic;
        this.treasureCollection = new ArrayList<>();
        this.traumatisedHero = traumatisedHero;
    }

    public String getName() {
        return name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public ArrayList<TreasureType> getTreasure() {
        return treasureCollection;
    }

    public TraumatisedHero getTraumatisedHero() {
        return traumatisedHero;
    }

    public void addTreasure(TreasureType treasure){
        this.treasureCollection.add(treasure);
    }

    public void removeTreasure(TreasureType treasure){
        this.treasureCollection.remove(treasure);
    }
}
