package character;

public enum AttackType {
    PETRIFICUSTOTALUS(30),
    EXPELLIRAMUS(20),
    EPISKY(10),
    BRACKIUMEMENDO(40),
    FIREBLAST(50),
    BITE(20),
    STAB(10),
    SLASH(20),
    SECTUMSEMPRA(30),
    PROTEGO(20);

    private final int attackPower;

    AttackType(int attackPower) {
        this.attackPower = attackPower;
    }
}
