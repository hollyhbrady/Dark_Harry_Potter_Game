package character;

public enum AttackType {
    PETRIFICUSTOTALUS(30),
    EXPELLIRAMUS(20),
    EPISKY(10),
    BRACKIUMEMENDO(40),
    FIREBLAST(50),
    BITE(20),
    STAB(10),
    SLASH(30),
    SECTUMSEMPRA(30),
    PROTEGO(20),
    PETRIFY(50),
    AVADAKEDAVRA(60),
    DEMENTORSKISS(30);

    private final int attackPower;

    AttackType(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
