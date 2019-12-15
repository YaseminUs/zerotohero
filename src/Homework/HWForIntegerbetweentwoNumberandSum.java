package Homework;

public class HWForIntegerbetweentwoNumberandSum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=110;i<=198;i++){
            if(i%11==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
