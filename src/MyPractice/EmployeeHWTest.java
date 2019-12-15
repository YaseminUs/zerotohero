package MyPractice;

public class EmployeeHWTest {
    public static void main(String[] args) {

        EmployeeHW employeeHW=new EmployeeHW();

        employeeHW.setName("yasemin");
        System.out.println(employeeHW.getName());
        employeeHW.setEmploymentYear(2015);
        System.out.println(employeeHW.getEmploymentYear());
        employeeHW.setAge(39);
        System.out.println(employeeHW.getAge());
        employeeHW.setWorkHour(80);
        System.out.println(employeeHW.getWorkHour());
        employeeHW.setLocation("Schaumburg");
        System.out.println(employeeHW.getLocation());

        employeeHW.calculateSalary();
        System.out.println(employeeHW.calculateSalary());
        employeeHW.yearlysalary();
        System.out.println(employeeHW.yearlysalary());
        employeeHW.totalEmploymentYear();
        System.out.println(employeeHW.totalEmploymentYear());
        employeeHW.bonusAmount(5,10);
        System.out.println(employeeHW.bonusAmount(5,10));


        EmployeeHW employeeHW1=new EmployeeHW("Yunus",2000,40,8,"Schaumburg");
        System.out.println(employeeHW1.getName());
        System.out.println(employeeHW1.getEmploymentYear());
        System.out.println(employeeHW1.getAge());
        System.out.println(employeeHW1.getWorkHour());
        System.out.println(employeeHW1.getLocation());





    }
}
