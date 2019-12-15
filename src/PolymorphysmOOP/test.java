package PolymorphysmOOP;

public class test {
    public static void main(String[] args) {

        //referance side has to be Super class
        //object side has to be Child class
        Super child = new Grandchild();
        child.myMethod();
        child.staticMethod();

        System.out.println("==============");

        Child child1 = new Grandchild();
        child1.childMethod();
        child1.myMethod();
        child1.staticMethod();

        System.out.println("==============");

        Super child2 = new Grandchild();
        ((Child)child2).childMethod();  //casting with child method
        ((Child)child2).staticMethod();
        ((Grandchild)child2).staticMethod();
    }
}
