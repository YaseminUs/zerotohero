package Exception;

public class Error {
    public static void myMethod() {
        System.out.println("I am inside of my method");
        myMethod();
//       try{
//           myMethod();
//       }catch(Throwable e){
//           System.out.println("Out of memory"); -->we must not handle Errors
//           System.out.println(e.getMessage());     this is StackOverFlowError
//       }

    }

    public static void main(String[] args) {
        myMethod();
    }

}
