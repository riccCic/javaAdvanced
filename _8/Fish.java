package javaOopAdvanced._8;

public class Fish extends Animal{
    private String species;
    public Fish(String species,double height, double weight) {
        super(height, weight);
        this.species=species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + species + '\'' +
                "heght='" + getHeight() + '\'' +
                "weight='" + getWeight()+ '\'' +
                '}';
    }
    public Double runSpeedMetersPerSecond() {
        Double run = getWeight() * 2;
        return run;
    }
}
