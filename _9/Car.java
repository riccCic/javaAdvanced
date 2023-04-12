package javaOopAdvanced._9;

public class Car implements Movable {
    @Override
    public void andareAvanti() {
        System.out.println("la macchina sta camminando verso avanti!");
    }

    @Override
    public void andareIndietro() {
        System.out.println("la macchina cammi all'indietro!");
    }
}
