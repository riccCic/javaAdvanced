package javaOopAdvanced._8;

public class Dog extends Animal {
    private String breed;
    public Dog(String breed,double height, double weight) {
        super(height, weight);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "heght='" + getHeight() + '\'' +
                "weight='" + getWeight()+ '\'' +
                '}';
    }
   public Double runSpeedMetersPerSecond(){
       Double run=getHeight()*2;
        return run;
   }
}
