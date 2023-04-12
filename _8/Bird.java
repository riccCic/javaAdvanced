package javaOopAdvanced._8;

public class Bird extends Animal{
    private Double wingSpan;
    public Bird(Double wingSpan,double height, double weight) {
        super(height, weight);
        this.wingSpan=wingSpan;
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Wing span='" + wingSpan + '\'' +
                "heght='" + getHeight() + '\'' +
                "weight='" + getWeight()+ '\'' +
                '}';
    }
    public Double runSpeedMetersPerSecond() {
        Double run = wingSpan * 2;
        return run;
    }
}
