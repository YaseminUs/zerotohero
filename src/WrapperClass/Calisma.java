package WrapperClass;

public class Calisma {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(10);
        Integer i2=new Integer(10);
        Integer i3=10;//autoboxing
        System.out.println(i3);

        Integer i4=20;
        System.out.println(i4);
        Integer i5=new Integer(20);
        System.out.println(i5);

        Short sh=new Short("16");
        System.out.println(sh);

        Boolean bl=true;
        System.out.println(bl);

        String st="123";
        System.out.println(st);
        int vl=Integer.parseInt(st);
        System.out.println(vl);

       String table = "true";
        Boolean blconvert=Boolean.parseBoolean(table);
        System.out.println(blconvert);

        Integer is = 1000;
        Integer iv = 1000;

        System.out.println(is==iv);
        System.out.println(is==1000);
        System.out.println(is.equals(iv));
        System.out.println(is.equals(1000));

        Boolean b = true;
        Boolean b2 = true;

        System.out.println("Boolean test");
        System.out.println(b==b2);
        System.out.println(b.equals(b2));

        Short s = 100;
        Short s1 = 100;
        System.out.println("Short Test");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));















    }
}
