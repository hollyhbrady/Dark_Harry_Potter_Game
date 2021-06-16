package character;

public abstract class Character {

    private String name;
    private double hP;
    private double cP;
    private float accuracy;

    public Character(String name, double hP, double cP, float accuracy) {
        this.name = name;
        this.hP = hP;
        this.cP = cP;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public double getcP() {
        return cP;
    }

    public double gethP() {
        return hP;
    }

    public float getAccuracy() {
        return accuracy;
    }
}
