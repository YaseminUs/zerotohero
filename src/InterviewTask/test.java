package InterviewTask;

public class test {
    public static void main(String[] args) {

        ProgramerTeacher teacher = new ProgramerTeacher();
        teacher.addLanguage("Java");

        Programmer programmer = new Programmer();
        System.out.println(teacher.teach(programmer,"Java"));

    }
}
