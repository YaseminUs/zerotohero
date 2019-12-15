package Arrays;

public class ArraysWordLenghts {
    public static void main(String[] args) {
        String[] names = {"Erick ", "john", "Patel", "Harsh", "Sarah", "Lily", "Nina"};

        //print out names which has lenght of 4

        for(int i=0 ;i<names.length; i++){
            if(names[i].length()==4){
                System.out.println(names[i]);
            }
        }
        System.out.println("-----------");

        for(String n:names){
            if(n.length()==4){
                System.out.println(n);
            }

        }

    }
}