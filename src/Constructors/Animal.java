package Constructors;

public class Animal {

    public  String name;
    public int age;
    private String color;
    protected int weight;//you can acsess under same package also, another but under subclass
    int height;//default access under modifier. is package protecter only accesible under same packege



    public  void eat(){
        System.out.println("Animal is eating");
    }
    private  void sleep(){
        System.out.println("Animal is sleeping ");
    }

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.sleep();
        animal1.color="pink";
        System.out.println(animal1.color);
        animal1.weight=50;
        System.out.println(animal1.weight);
    }
}
