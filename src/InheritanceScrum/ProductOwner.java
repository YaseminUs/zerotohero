package InheritanceScrum;

public class ProductOwner extends ScrumTeam{
    public ProductOwner(String projectName) {
        super(projectName);
    }
    @Override
    public void progress(){
        System.out.println("Product Owner progress");
    }
    @Override
    public void work(){
        System.out.println("Product Owner work");
    }
    @Override
    public void sprint() {
        System.out.println("Product Owner sprint");
    }
    public ProductOwner(String teamName,String projectName){
        this(projectName);
        this.teamNAme=teamName;
    }




}
