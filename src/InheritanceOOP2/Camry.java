package InheritanceOOP2;

public class Camry extends Car {

    public Camry(){
        super();
    }

    @Override
    public Integer velocity(){
        return 125;
    }
    public String carName(){
        return "camry";
    }
}
