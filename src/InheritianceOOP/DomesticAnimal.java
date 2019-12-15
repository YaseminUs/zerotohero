package InheritianceOOP;

public class DomesticAnimal extends Animal {

    @Override
    public void eat(){
        System.out.println("domestic animal is eating");
    }
    @Override
    public void sleep(){
        System.out.println("domestic Animal is sleeping");
    }
    @Override
    public void run(){
        System.out.println("domestic Animal is runnnig");
    }



}

