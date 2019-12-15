package AbstractionOOP2;

public class triangle extends Shape {

    int height;
    int with;

    public triangle(String name){
        super(name);
    }

    @Override
    public double calculateArea() {
        return height*with/2;
    }

    @Override
    protected void draw() {
        System.out.println("I am drawwing triangle");
    }
}
