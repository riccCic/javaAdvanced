package javaOopAdvanced._9;

public class Boat implements Movable{
    @Override
    public void andareAvanti() {
        System.out.println("la barca va avanti");
    }

    @Override
    public void andareIndietro() {
        System.out.println("la barca va indietro");
    }
}
