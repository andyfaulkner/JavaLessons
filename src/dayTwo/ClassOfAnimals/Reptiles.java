package dayTwo.ClassOfAnimals;

/**
 * Created by student on 28-Jun-16.
 */
public class Reptiles extends Animals {

    private boolean hasLegs;
    private boolean hasScales;
    private boolean laysEggs;

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public Reptiles(){}

    public Reptiles(boolean hasLegs, boolean hasScales, boolean laysEggs) {
        this.hasLegs = hasLegs;
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;
    }

    @Override
    public String toString(){
        return "It is a species of " + this.getSpecies() + " Does it have legs " + hasLegs + " Does it have a vertebrate " + this.isVertebrate();
    }
}
