package rooms;

public enum TreasureType {
    BAGOFGALLEONS(30),
    CHESTOFGALLEONS(150),
    RIDDLESDIARY(100),
    GAUNTSRING(150),
    SALAZARSLOCKET(200),
    HELGASCUP(300),
    ROWENASDIADEM(450),
    NAGINI(50),
    HPSOUL(2);

    private final int treasureValue;

    TreasureType(int treasureValue){
        this.treasureValue = treasureValue;
    }

}
