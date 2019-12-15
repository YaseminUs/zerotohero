package InheritanceScrum;

public class ScrumMaster extends ScrumTeam{

    public ScrumMaster(String projectName) {
        super(projectName);
    }

    @Override
    public void progress(){
        System.out.println("Scrum Master progress");
    }
    @Override
    public void work(){
        System.out.println("Scrum Master work");
    }
    @Override
    public void sprint() {
        System.out.println("Scrum Master sprint");
    }
    public ScrumMaster(String teamName,String projectName){
        this(projectName);
        this.teamNAme=teamName;
    }





}
