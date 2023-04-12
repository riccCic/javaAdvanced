package javaOopAdvanced._9;

public abstract class Shape {
   private double altezza;
   private double larghezza;

    public Shape(double altezza) {
        this.altezza=altezza;
    }
    public Shape(double altezza, double larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

}
