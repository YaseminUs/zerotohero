package InheritanceOOP3;

public class HR extends Company {

    public HR(){
        super("Google");
    }
    @Override
    public Integer employees(){
        return 20;
    }

}
