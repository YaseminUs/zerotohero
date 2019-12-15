package InheritanceScrum;

public class Hierarchy {

    public static void main(String[] args) {
        Developer dev = new Developer("Best","Java Developer");
        dev.work();
        dev.progress();
        System.out.println(dev.projectName);
        System.out.println(dev.teamNAme);

        System.out.println("==============");

        SDET sdet = new SDET("Good","Java SDET");
        sdet.sprint();
        sdet.work();
        System.out.println(sdet.projectName);
        System.out.println(sdet.teamNAme);

        System.out.println("=============");

        ScrumMaster sm = new ScrumMaster("Prefect","java scrum master");
        sm.progress();
        sm.sprint();
        System.out.println(sm.projectName);
        System.out.println(sm.teamNAme);

        System.out.println("==============");

        ProductOwner po = new ProductOwner("Excellent","java product owner");
        po.work();
        po.progress();
        System.out.println(po.projectName);
        System.out.println(po.teamNAme);
    }
}
