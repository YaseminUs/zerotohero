package InheritanceScrum;

    public class Developer extends ScrumTeam {

        public Developer(String projectName) {
            super(projectName);
        }
        @Override
        public void progress(){
            System.out.println("Developer progress");
        }
        @Override
        public void work(){
            System.out.println("Developer work");
        }
        @Override
        public void sprint() {
            System.out.println("Developer sprint");
        }
        public Developer(String teamName,String projectName){
         this(projectName);
         this.teamNAme=teamName;
        }

        }








