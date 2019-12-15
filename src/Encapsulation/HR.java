package Encapsulation;

public class HR {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFirstName("Jhon");
        employee.setLastName("Doe");
        employee.setAge(25);
        employee.setEmloyeeID("ASF46676788F");
        employee.setSSN(32536565);
        employee.setGender('M');
        employee.setSalary(120000);

        System.out.println(employee.getAge());
        System.out.println(employee.getEmloyeeID());
    }
}
