package character;

public interface IPerson {

    String canMove();
    String canTalk();

    double canAttack(Character character, AttackType attack);

    double reduceCP(AttackType attack);
}
