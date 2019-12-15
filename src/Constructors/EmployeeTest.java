package Constructors;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee=new Employee();

        employee.setName("yasemin");
        System.out.println(employee.getName());
        employee.setAge(39);
        System.out.println(employee.getAge());
        employee.setEmploymentYear(2015);
        System.out.println(employee.getEmploymentYear());
        employee.setWorkHour(80);
        System.out.println(employee.getWorkHour());
        employee.setLocation("Scahaumburg");
        System.out.println(employee.getLocation());


        employee.calculateSalary();
        System.out.println(employee.calculateSalary());
        employee.yearlysalary();
        System.out.println(employee.yearlysalary());
        employee.totalEmploymentYear();
        System.out.println(employee.totalEmploymentYear());
        employee.bonusAmaount(5,10);
        System.out.println(employee.bonusAmaount(5,10));

        Employee employee1=new Employee("Jasmine",2019,39,80,"Chicago");



    }


}
