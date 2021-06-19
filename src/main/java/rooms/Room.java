package rooms;

import character.AfflictionType;
import character.Enemy;
import character.TraumatisedHero;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Enemy enemy;
    private Character character;
    private String characteristic;
    private ArrayList<TreasureType> treasureHoard;
    private TraumatisedHero traumatisedHero;
    private AfflictionType roomAffliction;

    public Room(String name, Enemy enemy, String characteristic, ArrayList treasureHoard, TraumatisedHero traumatisedHero, AfflictionType roomAffliction) {
        this.name = name;
        this.enemy = enemy;
        this.characteristic = characteristic;
        this.treasureHoard = new ArrayList<>();
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
        return treasureHoard;
    }

    public TraumatisedHero getTraumatisedHero() {
        return traumatisedHero;
    }

    public AfflictionType getRoomAffliction() {
        return roomAffliction;
    }

    public void addTreasure(TreasureType treasure) {
        this.treasureHoard.add(treasure);
    }

//    Check with instructors on Monday

//    public int removeTreasure(Character character, TreasureType treasure, Room room) {
//        if (enemy.personHpZero(enemy) == true) {
//            room.emptyRoomTreasure(room, treasure);
//        }
//        return 0;
//    }

//    Issue with For Loop, ; expected 67, loop doesn't recognise what treasure is.

//    public int emptyRoomTreasure(Room room, TreasureType treasure) {
//        for (treasure: treasureCollection){
////            if (treasureCollection.size() > 0) {
//            traumatisedHero.takeTreasure(room, treasure);
//        }
//    }

    public void afflictHero(TraumatisedHero hero) {
        if (hero.getAfflictionType() == this.roomAffliction) {
            hero.setcP(hero.getcP() * .8);
        }
    }
}




