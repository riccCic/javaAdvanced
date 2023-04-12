package javaOopAdvanced._9;

public class Cerchio extends Shape{

    public Cerchio(double altezza) {
        super(altezza);

    }

    public String calculateArea(){
        return "L'area del cerchio è: "+Math.PI * Math.pow((getAltezza() / 2), 2);
    }
}
