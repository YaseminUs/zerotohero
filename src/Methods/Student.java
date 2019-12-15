package Methods;

public class Student {
    //over loading creating method means: method name has to be same but parametre has to be diffrent
    int age;
    public void study(){
        System.out.println("student is studying ! ");
    }
    public void study(int hours){
        System.out.println("student is studying " + hours + " hours. ");
    }

    public void study(String name){
       System.out.println(name + " is studying. ");
   }

}


