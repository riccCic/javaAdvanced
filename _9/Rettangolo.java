package javaOopAdvanced._9;

public class Rettangolo extends Shape {

    public Rettangolo(double altezza,double larghezza) {
        super(altezza,larghezza);
    }

    public String calculateArea() {
        return "l'area del rettangolo è: "+getAltezza() * getLarghezza();
    }
}