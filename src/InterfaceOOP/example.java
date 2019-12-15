package InterfaceOOP;

public class example {
    public static void main(String[] args) {
        bird b= new bird();
        b.fly();
        b.makeNoise();

        plane p = new plane();
        p.fly();
        p.makeNoise();

        Macy m =new Macy();
        m.countEmployees();
        m.sellItem();
    }
}
