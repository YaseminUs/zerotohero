package InheritanceOOP3;

public class staticBlocks {

    String name;
    public  final String LEGALSTATUS ; //"Citizen";

    static {
        //LEGALSTATUS = "Citizen";
        System.out.println("i am static block of StaticBlock class");
    }
    {
        LEGALSTATUS = "Citizen";
        System.out.println("I am static bloc from Staticbloc class");
    }
    {
        System.out.println("I am instance block of StaticBlock class");
    }
    public staticBlocks(){
        System.out.println("I am constructor of Staticblock class");
    }





}
