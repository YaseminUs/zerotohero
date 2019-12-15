package InheritanceOOP3;

public class Company {
    String name;

    public Company(String name){
        this.name = name;
    }
    public Number employees(){
        return 250;
    }
    public Object progress(){
        return "in the middle of the project";
    }
    protected int building(){
        return 3;
    }


}
