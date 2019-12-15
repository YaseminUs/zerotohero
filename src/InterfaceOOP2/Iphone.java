package InterfaceOOP2;

public class Iphone extends CellPhone {

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }
    @Override
    public void text() {
        System.out.println("Iphone is texing");
    }
    @Override
    public void takePicture() {
        System.out.println("I phone is taking picture");
    }
    @Override
    public void location() {
        System.out.println("Iphone does not flash card");
    }
    @Override
    public void faceId() {
        System.out.println("Iphone has faceId function");
    }
}
