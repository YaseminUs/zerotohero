package Abstraction00P;

public class TechtorialClass {

    public static void main(String[] args) {

        //Student student = new Student();
        //we can not instantiate(create an object )abstract class
          CampusStudent cs = new CampusStudent();
          cs.homeWork();
          cs.attendClass();

          System.out.println("--------------");

          OnlineStudent os = new OnlineStudent();
          os.attendClass();
          os.homeWork();
        }
    }


