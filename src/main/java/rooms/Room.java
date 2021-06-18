package rooms;

import character.AfflictionType;
import character.Enemy;
import character.TraumatisedHero;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Enemy enemy;
    private String characteristic;
    private ArrayList<TreasureType> treasureCollection;
    private TraumatisedHero traumatisedHero;
    private AfflictionType roomAffliction;

    public Room(String name, Enemy enemy, String characteristic, ArrayList treasureCollection, TraumatisedHero traumatisedHero, AfflictionType roomAffliction){
        this.name = name;
        this.enemy = enemy;
        this.characteristic = characteristic;
        this.treasureCollection = new ArrayList<>();
        this.traumatisedHero = traumatisedHero;
        this.roomAffliction = roomAffliction;
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

    public AfflictionType getRoomAffliction() {
        return roomAffliction;
    }

    public void addTreasure(TreasureType treasure){
        this.treasureCollection.add(treasure);
    }

    public void removeTreasure(TreasureType treasure){
        this.treasureCollection.remove(treasure);
    }
    public void afflictHero(TraumatisedHero hero){
        if (hero.getAfflictionType() == this.roomAffliction){
            hero.setcP(hero.getcP() * .8);
        }
    }
}
