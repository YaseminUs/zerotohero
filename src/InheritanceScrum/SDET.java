package InheritanceScrum;

public class SDET extends ScrumTeam{


    public SDET(String projectName) {
        super(projectName);
    }
    @Override
    public void progress(){
        System.out.println("SDET progress");
    }
    @Override
    public void work(){
        System.out.println("SDET work");
    }
    @Override
    public void sprint() {
        System.out.println("SDET sprint");
    }
    public SDET(String teamName,String projectName){
        this(projectName);
        this.teamNAme=teamName;
    }

    }
