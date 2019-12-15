package Constructors;

import Homework.Practice;

public class PracticeCar {

    private String color;
    private String model;
    private double engine;
    private int doors;

    public PracticeCar() {

    }
    public PracticeCar(String color,String model,double engine,int doors){
        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setEngine(int engine){
        this.engine=engine;
    }

    public double getEngine() {
        return engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public static void main(String[] args) {
        PracticeCar car=new PracticeCar("black","mercedes Glk",6,4);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getEngine());
        System.out.println(car.getDoors());

        PracticeCar car1=new PracticeCar();
        car1.setColor("white");
        System.out.println(car1.getColor());
        car1.setModel("Nissan Murano");
        System.out.println(car1.getModel());
        car1.setEngine(6);
        System.out.println(car1.getEngine());
        car1.setDoors(5);
        System.out.println(car1.getDoors());




    }






}
