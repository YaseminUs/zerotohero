package Constructors;

public class Employee {
//    1- Write the class with name of Employee. The class needs 5 field.
//    Name, employmentYear, Age, workHour, Location.
//    The class needs to have one no argument constructor.
//    The class need to have two argument constructor for Name and employementYear,
//    Create 5 argument constructor to initialize the fields. This constructor should set up the Age 0 if the age is less than 0.
//
//    Write the following methods(instance methods):
//
//    * Method names calculateSalary without any parameters, it needs to return the calculated salary (workHour*55$). This method is calculate the two week salary.
//
//    *Write the method to to calculate the yearlysalary, it will take no parameter but it will return yearly salary as a double.
//
//    *Method names totalEmploymentYear, it will take no argument but it will return the total employment year as an integer.
//
//    *Write the method to calculate the bonus amount. The method will take two parameter total employment year and total workday.
//    If the total employment year more than 5 and total workday more than 240, the bonus amount will be 15%,
//    if the employment year less than 5 and total workday is more than 240 the bonus amount is 10% of yearly salary.
//
//    *Create getter and setter for all the instance variables.
//
//    *Create the one class names EmployeeTest, and create the object according to the above description and test your methods.


    //Name, employmentYear, Age, workHour, Location.

    private String name;
    private int employmentYear;
    private int Age;
    private int workHour;
    private String Location;

    public Employee(){

    }
    public Employee(String Name, int employmentYear){

    }
    public Employee(String name,int employmentYear,int Age,int workHour,String Location){
        this.name=name;
        this.employmentYear=employmentYear;
        this.Age=Age;
        this.workHour=workHour;
        this.Location=Location;

        if(this.Age<0){

        }
    }
    public double calculateSalary(){
        double calculatesalary = (55 * workHour);
        return calculatesalary;
    }
    public double yearlysalary(){
        double yearlySalary=calculateSalary()*52/2;
        return yearlySalary;
    }
    public int totalEmploymentYear () {
        int currentYear=2019;
        int employmentYear=2015;
        return currentYear-employmentYear;
    }
    public double bonusAmaount ( double totalEmploymentYear, double totalWorkday){
        if (totalEmploymentYear() > 5 && totalWorkday > 240 / 100 * 15) {
        }else if (totalEmploymentYear() < 5 && totalWorkday < 240 / 100 * 10) {
        }
        return (totalEmploymentYear * yearlysalary());

    }
    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getEmploymentYear () {
        return employmentYear;
    }
    public void setEmploymentYear ( int employmentYear){
        this.employmentYear = employmentYear;
    }
    public int getAge () {
        return Age;
    }
    public void setAge ( int age){
        this.Age = age;
    }
    public int getWorkHour () {
        return workHour;
    }
    public void setWorkHour ( int workHour){
        this.workHour = workHour;
    }
    public String getLocation () {
        return Location;
    }
    public void setLocation (String location){
       this.Location = location;
    }
}


