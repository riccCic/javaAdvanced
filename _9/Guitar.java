package javaOopAdvanced._9;

public class Guitar extends Instruments{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("sto suonando la chitarra!!");
    }
}
