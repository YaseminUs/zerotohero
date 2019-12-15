package PolymorphysmOOP2;

public class men extends human implements dad{
    @Override
    public void eat(){
        System.out.println("Men is eating");
    }
    @Override
    public void walk(){
        System.out.println("Men is walking");
    }
    public void shave(){
        System.out.println("Men is shaving");
    }
    public void playSport(){
        System.out.println("Men is playing soccer");
    }
    @Override
    public void feed() {
        System.out.println("Dad is feeding his family");

    }
}
