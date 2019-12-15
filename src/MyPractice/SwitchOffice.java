package MyPractice;

import java.util.Scanner;

public class SwitchOffice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the state Name (Florida or Illinois)");
        String stateName = input.nextLine();
        switch (stateName) {
            case "Florida":
                System.out.println("Please enter the city name Tampa, Miami or JacksonVille ");
                String cityname = input.nextLine();
                switch (cityname) {
                    case "Tampa":
                        System.out.println("selected state name " + stateName + " selected city name " + cityname);
                        break;
                    case "Miami":
                        System.out.println("selected state name " + stateName + " selected city name " + cityname);
                        break;
                    case "JacksonVille":
                        System.out.println("selected state name " + stateName + " selected city name " + cityname);
                        break;
                    default:
                        System.out.println("selected state is not available");
                }break;


                case "Ilinois":
                    System.out.println("Please enter the city name (Chicago, Elgin or Des Plaines) ");
                    String cityname2 = input.nextLine();
                    switch (cityname2) {
                        case "Chicago":
                            System.out.println("selected state name " + stateName + " selected city name " + cityname2);
                            break;
                        case "Elgin":
                            System.out.println("selected state name " + stateName + " selected city name " + cityname2);
                            break;
                        case "Des Plaine":
                            System.out.println("selected state name " + stateName + " selected city name " + cityname2);
                            break;
                        default:
                            System.out.println("selected state is not available");
                    }



        }





    }
}