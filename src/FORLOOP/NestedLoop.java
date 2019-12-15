package FORLOOP;

public class NestedLoop {
    public static void main(String[] args) {


        for(int i=0;i<5;i++){
            for(int k=0;k<4;k++){
                System.out.print(i+ " - " +k + ",");
            }
        }

        for(int j=0;j<3;j++){
            for(int n=1;n<4;n++){
                System.out.print(j+ " - " +n+ " ,");
            }
        }

        for(int j=0;j<3;j++){
            System.out.println("yasemin");
            for(int n=1;n<4;n++){
                System.out.println("uslu");
            }
        }







    }

}
