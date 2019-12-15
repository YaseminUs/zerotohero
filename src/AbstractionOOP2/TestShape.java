package AbstractionOOP2;

public class TestShape {
    public static void main(String[] args) {
        triangle triangle = new triangle("Triangle");
        triangle.height = 5;
        triangle.with = 6;
        System.out.println(triangle.calculateArea());
        triangle.draw();
        triangle.superDraw();
        System.out.println("------------");

        Circle circle = new Circle("Circle");
        System.out.println(circle.calculateArea());
        circle.draw();
        circle.superDraw();


    }


}
