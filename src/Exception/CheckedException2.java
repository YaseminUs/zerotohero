package Exception;

public class CheckedException2 {

    public static void main(String[] args) throws Exception {


        System.out.println("Iam going to sleep");
        Thread.sleep(5000);
        System.out.println("I woke up!");

        try {
            System.out.println(5 / 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("i finish my code");




    }
}
