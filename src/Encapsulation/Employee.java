package Encapsulation;

public class Employee {
    
    private String firstName;
    private String lastName;
    private int age;
    private int SSN;
    private char gender;
    private String emloyeeID;
    private int salary;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getSSN() {
        return SSN;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmloyeeID() {
        return emloyeeID;
    }
    public void setEmloyeeID(String emloyeeID) {
        this.emloyeeID = emloyeeID;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    }

