package Switch;

import java.util.Scanner;

public class StateNAme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Using scanner ask the user the state name
        // there ara stata illinois, florida
        // if your input is matching one of the state then ask the second question
        // please enter your city name
        // you need to display  selected state is not avaiable
        // illinois
        // Chicago, Elgin , Des plains
        // florida , Miami, Tampa , Jacksonville
        // The have selected the organization in Statename and cityname
        // The have selected the organization in Illinois and Chicago

        System.out.println("Please enter your state");
        String StateName=input.nextLine();
        switch (StateName){
            case "Illinois":
                System.out.println("Please enter your city  name ");
                //  System.out.println("Please enter your city (Chicago , Elgin , Des plains)");
                String CityName=input.nextLine();
                switch (CityName) {
                    case "Chicago":
                        System.out.println("The have selected the organization " + StateName + CityName);
                        break;
                    case "Elgin":
                        System.out.println("The have selected the organization " + StateName + CityName);
                        break;
                    case "Des Plains":
                        System.out.println("The have selected the organization " + StateName + CityName);
                }
            default:
                System.out.println("The selected state is not avaiable");
                break;
            case "Florida":
                System.out.println("Please enter your city ");
                String CityName2=input.nextLine();
                switch (CityName2){
                    case "Miami":
                        System.out.println("The have selected the organization " +StateName + "city name" +CityName2);
                        break;
                    case "Tampa":
                        System.out.println("The have selected the organization " +StateName + "city name" + CityName2);
                        break;
                    case "Jacsonville":
                        System.out.println("The have selected the organization " +StateName + "city name" + CityName2);
                        break;
                    default:
                        System.out.println("The selected state is not avaiable");
                        System.out.println("The selected city is not avaiable");
                }
        }
    }
}







