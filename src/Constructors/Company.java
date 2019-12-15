package Constructors;

public class Company {

    String name;
    String location;
    String area;
    int employeeNumber;
    int budget;

    public Company() {

        //this("Chase","Chicago","finance",50, 1100);
    }

    //create tree argument constroctor and initialize the values for
    //name,location,area
    public Company(String name, String location, String area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }


    //create constructor to initilize all the instance variables
    public Company(String name, String location, String area, int employeeNumber, int budget) {

        this(name, location, area);//constroctor icinde constroctor -it should be first line

        this.employeeNumber = employeeNumber;
        this.budget = budget;
        displayCompanyInfo();
    }
    //Create method to display all the information for your object

    public void displayCompanyInfo() {
        System.out.println("company name" + name);
        System.out.println("company location" + location);
        System.out.println("Company area" + area);
        System.out.println("Employee number" + employeeNumber);
        System.out.println("Budget is " + budget);
    }


    public static void main(String[] args) {

        Company company = new Company(); // constructor
        Company company1 = new Company("Zara", "Scahaumburg", "Retail");
        System.out.println(company1.name);
        System.out.println(company1.employeeNumber);//0
        company1.employeeNumber = 50;
        System.out.println(company1.employeeNumber);//50
        company1.displayCompanyInfo();
        System.out.println("==========");
        Company company2 = new Company("Chase", "Chicago", "Finance", 400, 200000);

        System.out.println(company2.area);
        company2.displayCompanyInfo();
    }
}
