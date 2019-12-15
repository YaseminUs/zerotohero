package Exception;

public class MultiCatchException {
    public static void main(String[] args) {

        String id = "2k345a";
        int idNum = 0;


        try {
            idNum = Integer.parseInt(id);
            System.out.println(idNum);
            id ="111";
            idNum = Integer.parseInt(id);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("i am finally block");
        }
        System.out.println("i am out of try catch block");
        System.out.println(idNum);



    }
}

