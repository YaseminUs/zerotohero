package WrapperClass;

public class WrapperClassPractice {

    public static void main(String[]args){
        // important thing related with byte and short.
        // Once you create object from byte and short you need to cast them.
        // First Way
        Byte by=new Byte((byte)12);
        Short sh=new Short((short)20);
        Integer in=new Integer(50);
        Long ln=new Long(45092);
        Double db=new Double(50.9d);
        Float fl=new Float(43.89f);
        Boolean bl=new Boolean(true);
        Character ch=new Character('P');
        ////////////  Wrapper Classses ////////

        //Second way

        Byte by1=new Byte("12");
        // even thought l gave the values as aString, Java will convert them to the object
        Short sh1=new Short("44");
        System.out.println(by1);
        System.out.println(sh1);

        //Third Way

        Integer num=198;  // this are still object, wrpper class you don't need to use new keyword.
        Short num1=54;
        // if you provide the values directly without new keyword you don't need to cast.
        // What is the differences between Object and Primitive data types?
        // in object we can call the method, in primitive data type we don't have method
        //
        // Terms
        // What is the meaning of the instance of the class?
        // it is object from the class which we created
        // byte i;     i=50; --> initialization of the primitive data types
        // Boolean  bl  =new Boolean ()  ==> this is instantiation
        int number=55;  // ypu can not give null
        Integer computers=null; // if primitive data types is object we can give null
        //number=computers; // it will not give compile time error, however it will give the run time error.
        System.out.println(number);

        // Converting from String to primitive data types

        String values="455";
        int valueint=Integer.parseInt(values);
        System.out.println(valueint);
        String ab="1357";
        int abint=Integer.parseInt(ab);
        System.out.println(abint);


        String convertBl="123";
        boolean convert=Boolean.parseBoolean(convertBl);
        System.out.println(convert);
        //  if you are converting String value of boolean to the primitive, all values other than true or false, it will assign as a false;
        String intValue="900";
        int vl=Integer.parseInt(intValue);
        System.out.println(vl==900);

        //Converting String to Object

        String table="ture";
        Boolean tb= Boolean.valueOf(table);
        System.out.println(tb);
        String chair="C";
        Character ch1='C';  // or
//        int phone=Integer.parseInt("a");
//        System.out.println(phone);  // it will give the NumberFormatException
//        Integer phone=Integer.valueOf("12.56");
//        System.out.println(phone); // since values is double it will give NumberFormatException

        // AutoBoxing  it is coverting object to primitive

        int mouse=6;
        Integer mouse1=mouse;
        System.out.println(mouse);
        // Mouse primitive is aasigned as a wrapper class object.
        // AutoBoxing is automatic converting from primitive to wrapper class object
        // AutoBoxing is for every primitive data types.
        char c='k';
        Character cr=c; // it is autoboxing
        boolean b=true;
        Boolean bn=b;

        // UnBoxing it is converting primitive to object

        Float ft=15.10f;
        float ft1=ft;
        // java automatically convert to the primitive
        // it is called unboxing. Unboxing can be apply for all the primitive data types
        Double money=10000.99;
        double money1=money;  // is is unboxing
        Character paper='1';
        boolean bln=paper.isDigit(paper);
        System.out.println(bln);
        paper.isAlphabetic(paper);
        String stn="9Un7box4ing1";   // need nested loop
        // for (String s: stn)
    }
}
