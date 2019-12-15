package PolymorphysmOOP;

public class Child  extends Super{

    @Override
    public void myMethod(){
        System.out.println("I am inside of child class");
    }

    public static void staticMethod(){      //this not overridding same method just hidding
        System.out.println("I am static method from child class");
    }

    public void childMethod(){
        System.out.println("I am child method from child class");
    }





}
