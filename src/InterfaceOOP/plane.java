package InterfaceOOP;

public class plane implements Flyable,Sound {
    @Override
    public void fly() {
        System.out.println("plane is flying");
    }

    @Override
    public void makeNoise() {


    }
}
