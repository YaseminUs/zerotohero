package StringPackage;



public class StringSubs {

    public static void main(String[] args){

        String patientInfo="45 - Walnut - Jessica";
        System.out.println(patientInfo.substring(5));
        System.out.println(patientInfo.substring(5,11));


        System.out.println(patientInfo.substring(5,5));// " "bosluk
        //System.out.println(patientInfo.substring(5,4));// java will throw run time error

        //pationinfo.substring(5,5)---->it will emty string

        System.out.println(patientInfo.length());
        //lenght is 21
        //last index number is 20
        //pationinfo.substring(5,21)---->it will throw an exception

        System.out.println(patientInfo.substring(5,21));


        String cikolatainfo="1960 - Godiva - Frank ";
        System.out.println(cikolatainfo.substring(7));
        System.out.println(cikolatainfo.substring(7,13));
        System.out.println(cikolatainfo.substring(7));
        System.out.println(cikolatainfo.length());
        System.out.println(cikolatainfo.substring(7,20));
        System.out.println(cikolatainfo.substring(0,22));
        boolean checkyear=cikolatainfo.startsWith("1960");
        boolean checkbrand=cikolatainfo.contains("Godiva");
        boolean checkperson=cikolatainfo.endsWith("k");
        System.out.println("check my sentences "+checkyear + checkbrand + checkperson);





    }
}
