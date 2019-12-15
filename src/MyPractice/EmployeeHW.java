package MyPractice;

public class EmployeeHW {

    //Name, employmentYear, Age, workHour, Location.

    private String name;
    private int employmentYear;
    private int Age;
    private int workHour;
    private String Location;

    public EmployeeHW() {

    }

    public EmployeeHW(String name, int employmentYear) {

    }

    public EmployeeHW(String name, int employmentYear, int Age, int workHour, String Location) {
        //Age 0 if the age is less than 0.

        this.name = name;
        this.employmentYear = employmentYear;
        this.Age = Age;
        this.workHour = workHour;
        this.Location = Location;
        if (this.Age < 0) {

        }
    }

    public double calculateSalary() {
        //(workHour*55$)
        double calculateSalary = (workHour * 55);
        return calculateSalary;
    }

    public double yearlysalary() {
        double yearlysalary = calculateSalary() * 52 / 2;
        return yearlysalary;
    }

    public int totalEmploymentYear() {
        int currentyear = 2019;
        int employmentYear=2015;
        return currentyear-employmentYear;
    }

    public double bonusAmount(double totalemploymentYear, double totalWorkday) {
        //If the total employment year more than 5 and total workday more than 240, the bonus amount will be 15%,
        //if the employment year less than 5 and total workday is more than 240 the bonus amount is 10% of yearly salary.

        employmentYear = totalEmploymentYear();

        if (totalEmploymentYear() > 6 && totalWorkday > 440) {
            return yearlysalary() * 0.15;
        } else if (totalemploymentYear < 6 && totalWorkday < 440) {
            return yearlysalary() * 0.10;
        }

        return totalEmploymentYear() * yearlysalary();

    }

    //*Create getter and setter for all the instance variables.
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getEmploymentYear(){
        return employmentYear;
    }
    public void setEmploymentYear(int employmentYear){
        this.employmentYear=employmentYear;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
     public int getWorkHour(){
        return workHour;
    }
    public void setWorkHour(int workHour){
        this.workHour=workHour;
    }
    public String  getLocation(){
        return Location;
    }
    public void setLocation(String Location){
        this.Location=Location;
    }

}
