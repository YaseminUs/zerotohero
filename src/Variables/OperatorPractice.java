package Variables;

public class OperatorPractice {

    public static void main(String[] args){

        //Re-assingning the variables
       // Variables can be assigned and re-assigned many times after declaring


        int apple=10, banana, orange=13;
        banana=12;

        banana=9;
        banana=1;
        banana=4;

        System.out.println("Banana number is "+ banana);

        banana=8;
        banana=apple;
        //banana=10;
        //apple=10;
        apple=banana;

        System.out.println("Apple number is "+ apple);

        System.out.println("Orange number is "+ orange);
        System.out.println("Banana number is "+ banana);

        //banana=8;
        apple=7;
        banana=apple;
        //banana=7;
        //apple=7;
        apple=banana;

        System.out.println("Apple number is "+ apple);
        //banana=7
        banana=banana+1;
        //banana=7=1;
        //banana=8;
        System.out.println("Banana number is "+ banana);
        //orange=13;
        banana=orange+1;
        System.out.println("orange number is "+ orange);
        //banana=8
        //apple=7
        banana=apple;
        //banana=7
        //banana=7
        System.out.println("Banana number is "+ banana);

        banana+=1;
        //banana=banana+1
        //banana=8
        System.out.println("Banana number is "+ banana);
        //orange=13
        banana=orange+1;
        //banana=14
        System.out.println("Banana number is "+ banana);
        System.out.println("Orange number is "+ orange);

        banana+=1;
        //banana=banana+1;
        //banana=15
        System.out.println("Orange number is "+ orange);
        System.out.println("Banana number is "+ banana);

        banana-=2;
        //banana=banana-2;
        //banana=15-2;
        //banana=13

        System.out.println("Banana number is "+ banana);

        banana*=2;
        //banana=banana*2;
        //banana=13*2;
        //banana=26;
        System.out.println("Banana number is "+ banana);

        orange%=5;
        //orange=orange%5;
        //5+5+3
        //orange=3
        System.out.println("Orange number is" + orange);


        double taxAmount=10.5;
        float salary=40.7f;
        int number=100;
        //totalAmount=taxAmount+number+sallary;
        //151.2

        //double totalAmount=taxAmount+number+sallary;

        byte k=10;
        short n=8;
        int totalNumber=k+n;

        //totalNumber=k*n;
        //totalNumber=k-n;
        //totalNumber=k/n;

        int berry=14;
        System.out.println(berry);
        berry= berry++;

        System.out.println(berry);
        System.out.println(berry++);//14
        System.out.println(berry);

        berry=++berry; //15
        System.out.println(berry);

    /* Using Unery Operators Before variables
    it will first change the value then will assigne
     */

        // ++ --->it will add the 1 to current value
        //   -- --->it will substruct the 1 from current value
        //   int number=4;
        //   number=++number; 5
        //   number=--number; 4
        //   number=--number;3

        //Using Unery Operators After variable
        //it will assign the value then increase the value
        //int apple=6;
        //apple=apple++;--->6
        //apple=apple--;--->6
        //apple=++apple+5;--->12

        berry= berry++;
        System.out.println(berry++);


















    }
}
