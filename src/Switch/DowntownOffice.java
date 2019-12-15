package Switch;

import java.util.Scanner;

public class DowntownOffice {
    public static void main(String[] args) {

        //our downtown office there are 50 floor
        //30th floor there are 3 companies (walgreens, cvs , discover)
        //31 floor there are 2 companies (Techtorial, BluesCroos)
        //total number of is 6
        // elevator: which floor do you wanna go.
        //second question is which company you wanna go
        // Walgreen- Elevator number 1
        // Cvs - Elevator number 2
        // Discover -Elevator number 3
        // Techtorial - Elevator number 4
        // BlueCross - Elevator number 5
        Scanner input=new Scanner(System.in);
        //System.out.println("Which floor do you want to go ?");
        System.out.println("Please enter the floor number");
        String floorNumber=input.nextLine();
        switch (floorNumber){
            case "30":
                System.out.println("Please enter the company name");
                String companyName=input.nextLine();
                switch (companyName){
                    case "Walgreens":
                        System.out.println("Elevator Number is one " + companyName);
                        break;
                    case "CVS":
                        System.out.println("Elevator Number is two " + companyName);
                        break;
                    case "Discover Corp":
                        System.out.println("Elevator Number is three " + companyName);
                        break;
                    default:
                        System.out.println("Company is not in this floor");
                }
                break;
            case "31":
                System.out.println("Please enter the company name " );
                String companyName2=input.next();
                switch (companyName2){
                    case "Techtorial":
                        System.out.println("Elevator number is four " + companyName2);
                        break;
                    case "BlueCross":
                        System.out.println("Elevator number is five " + companyName2);
                        break;
                    default:
                        System.out.println("Company is not in this floor ");
                }
                break;
            default:
                System.out.println("Floor Number is not available ");
        }
    }
}
