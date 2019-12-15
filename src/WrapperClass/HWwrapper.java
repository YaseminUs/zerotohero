package WrapperClass;

public class HWwrapper {
        /*Create a method named getIntValue. This method will take the String as a parameter.
        if the string has int value, it take that the int values and will store as a Integer object
        and the method will return the Integer object.
        Please use isDigit() method
        Example:  String employeeId=“09/05/2019-Tech13a”
        Homework study=new Homework();
        System.out.println( study.getIntValue(employeeId) );
        String departmentId=“74b-DevTeam205s”
        System.out.println( study.getIntValue(departmentId) );
        OUTPUT:  090520191374205
         */
    //Create the one method, it will take the string as a parameter
    // and it will return the Wrapper integer value from the string

















    public void wrappInt(String wrapp) {
        String number = "";
        for (int i = 0; i < wrapp.length(); i++) {
            char ch = wrapp.charAt(i);
            if (Character.isDigit(ch)) {
                number = number + ch;
            }
        }
        int vl = Integer.parseInt(number);
        System.out.println(number);
    }

    public static void main(String[] args) {
        HWwrapper wr = new HWwrapper();
        wr.wrappInt("9Un7box4ing1");
    }


}


