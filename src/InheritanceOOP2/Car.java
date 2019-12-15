package InheritanceOOP2;

public class Car extends Vehicle {
    public Car(){
        super("toyota",2008);
    }
    public Car (String make){
        super("Lexus");
    }
    public Integer velocity(){
        return 100;
    }
    public String carName(){
        return "car";
    }




}
