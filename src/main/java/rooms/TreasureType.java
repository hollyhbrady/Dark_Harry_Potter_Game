package rooms;

public enum TreasureType {
    BAGOFGALLEONS(30, 0, 0),
    CHESTOFGALLEONS(1500, 0, 0),
    RIDDLESDIARY(100, 0, 0),
    GAUNTSRING(150, 0, 0),
    SALAZARSLOCKET(200, 0, 0),
    HELGASCUP(300, 0, 0),
    ROWENASDIADEM(450, 0, 0),
    NAGINI(50, 0, 0),
    HPSOUL(2, 0, 0),

    GRYFFINBLOW(0,10,0),
    HUFFLEPUFFLE(0,30,0),
    RITANCLAW(0,0,30),
    SLYTHERSCAG(0,0,20),
    HAGRIDSHROOMS(0,30,0),
    PUMPKINJUICEUP(0,0,20);

    private final int treasureValue;

    TreasureType(int treasureValue){
        this.treasureValue = treasureValue;
    }

}
