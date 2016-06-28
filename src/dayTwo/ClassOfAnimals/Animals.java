package dayTwo.ClassOfAnimals;

/**
 * Created by student on 28-Jun-16.
 */
public class Animals {

    private int age;
    private double weight;
    private String habitat;
    private boolean vertebrate;
    private double length;
    private double height;
    private double speed;
    private String birthDate;
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    public Animals(){}

    public Animals(double weight, String habitat, boolean vertebrate, double length, double height, double speed, String birthDate, String species) {

        this.weight = weight;
        this.habitat = habitat;
        this.vertebrate = vertebrate;
        this.length = length;
        this.height = height;
        this.speed = speed;
        this.birthDate = birthDate;
        this.species = species;
    }
}
