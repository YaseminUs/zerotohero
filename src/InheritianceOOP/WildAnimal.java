package InheritianceOOP;

public class WildAnimal extends Animal {

    @Override// Annotation
    public void eat(){
        System.out.println("wild animal is eating meat");
    }
    @Override
    public void sleep(){
        System.out.println("wild animal is not sleeping");
    }
    public void fight(){
        System.out.println("wild animal is fighting");



    }
}
