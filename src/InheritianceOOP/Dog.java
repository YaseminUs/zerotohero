package InheritianceOOP;

public class Dog extends DomesticAnimal{

    public void bark(){
        System.out.println("dog is barking");
    }
    @Override
    public void run(){
        System.out.println("Dog is runnnig");

    }

}
