package Switch;

import java.util.Scanner;

public class SwitchStudent {
    public static void main(String[] args) {

        Scanner input=new Scanner((System.in));
        System.out.println("please enter student number ");
        int studentNUmber=input.nextInt();

        switch (studentNUmber){

            case 123:
                System.out.println("Arslan");
                break;
            case 236:
                System.out.println("Muammer");
                break;
            case 250:
                System.out.println("Tima");
                break;
            default:
                System.out.println("Students ar not available");

        }

    }
}
