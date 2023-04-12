package javaOopAdvanced._9;

public abstract class Instruments implements Playable {
   private String name;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Instruments(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
}
