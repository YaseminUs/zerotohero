package PolymorphysmOOP2;

public class women extends human implements mother{

    @Override
    public void eat(){
        System.out.println("Women is eating");
    }
    @Override
    public void walk(){
        System.out.println("Women is walking");
    }

    public void makeUp(){
        System.out.println("women is doing makeup");
    }

    @Override
    public void takeCare() {
        System.out.println("mother is taking care of family");
    }
}
