package Abstraction00P;

public abstract class Student {

    int studenId;
    String studentName;

    public abstract void study(); //abstract method

    public abstract  void study(String name);//overloading abstract method

    abstract void attendClass();//abstract method

    public void homeWork(){ //regular method
        System.out.println("I have to do my homework before coming class");

    }

}
