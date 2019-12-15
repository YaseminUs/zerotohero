package InheritanceScrum;

public class ScrumTeam {
    String teamNAme;
    String projectName;

    public ScrumTeam(String projectName) {
      this.projectName=projectName;
    }

    public ScrumTeam(String teamNAme,String projectName){
        this(projectName);
        this.teamNAme = teamNAme;

    }
    public void progress()
    {
        System.out.println("ScrumTeam progress");
    }
    public void work(){
        System.out.println("ScrumTeam work");
    }
    public void sprint(){
        System.out.println("ScrumTeam sprint");
    }


}
