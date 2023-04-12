package javaOopAdvanced._9;

public class Piano extends Instruments{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("sto suonando il piano!!");
    }
}
