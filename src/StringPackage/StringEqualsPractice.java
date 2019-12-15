package StringPackage;

public class StringEqualsPractice {
    public static void main(String[] args) {
        String student="David";
        String student1="David";

        System.out.println(student==student1);
        String student2=new String("David");
        System.out.println(student==student2);
        student=student2;

    }
}
