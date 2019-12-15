package PolymorphysmOOP;

public class Grandchild extends Child {

    @Override
    public void childMethod(){
        System.out.println("I am child method in Grandchild class");
    }

    public static void staticMethod(){
        System.out.println("I am static method from GrandChild class");
    }



}
