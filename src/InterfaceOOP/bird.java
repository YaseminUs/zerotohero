package InterfaceOOP;

public class bird implements Flyable, Sound {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
    @Override
    public void makeNoise() {
        System.out.println("Chik chik");
    }
}
