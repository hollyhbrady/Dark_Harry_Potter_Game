package character;

public abstract class Character {

    private String name;
    private double hP;
    private double cP;
    private double accuracy;

    public Character(String name, double hP, double cP, double accuracy) {
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

    public double getAccuracy() {
        return accuracy;
    }
}
