package character;

public enum AfflictionType {
    PTSD(30),
    ALCOHOLISM(20),
    MAGICMUSHROOMADDICTION(30),
    MERCILESS(20);

    private final int afflictionValue;

    AfflictionType(int afflictionValue) {
        this.afflictionValue = afflictionValue;
    }
}
