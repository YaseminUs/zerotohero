package Collections;

public class FlowerTest {
    public static void main(String[] args) {

        Flower rose= new Flower("Rose",111111);

        rose.addFlower("Red Rose",1234455);
        rose.addFlower("Blue Rose",123453);
        rose.addFlower("yellow Rose",12497);

        int redFlowerBarcode = rose.findFlower("Red Rose");
        System.out.println(redFlowerBarcode);


        String flowerName = rose.findFlower(1234455);
        System.out.println(flowerName);

        System.out.println("this the list of flower");
        rose.printAllFlower();

        rose.removeFlower("Blue Rose");
        System.out.println("this is after removing the flower");
        rose.printAllFlower();
    }
}
