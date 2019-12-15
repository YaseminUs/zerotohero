package StringBuilder;

public class StringBuilderPractice {


    public static void main(String[] args) {
        StringBuilder table=new StringBuilder();
        StringBuilder table1=new StringBuilder("Rockwell ");

        System.out.println(table);
        table.append("ikea");
        System.out.println(table);
        //Dynamic Polymorhism----> java dosnt know which methjod to call until runtime
        //at runtime java will select method according your parameter

        table.append(10);
        System.out.println(table);//ikea 10

        table1.append(10.4);
        System.out.println(table1);

        StringBuilder success=new StringBuilder().append("Techtorial").append(2019);
        success.append("Best Year Ever ").append(true);
        System.out.println(success);
        System.out.println("***********");
        new StringBuilder().append("Tech");   // anonymis  it will go to the garbage collection
        System.out.println("******");
        // "Tech"; you cn not do it in this way
        System.out.println("Tech".charAt(0));
        StringBuilder computer=new StringBuilder();
        for(char i='a';i<'z';i++){
            computer.append(i);
        }
        System.out.println(computer);
        StringBuilder success1=new StringBuilder("Working Hard");
        success.append(" does not make you successful ");
        System.out.println(success1); // Working Hard does not make you successful
        StringBuilder truth=success1.append(" Thinking hard makes you successful");
        System.out.println(success1);
        System.out.println(truth);  // Working Hard does not make you successful Thinking hard makes you successful
        System.out.println(success1);

        StringBuilder success2=new StringBuilder("Tech");
        success2.append("torial ");
        System.out.println(success2);
        StringBuilder truth1=success2.append("2019 ");
        System.out.println(success2);
        System.out.println(truth1);
        truth1=truth1.append("Best ").append("Summer ");
        System.out.println(success2);
        System.out.println(truth1);
        success2.append(10);
        System.out.println(success2);
        System.out.println(truth1);


        StringBuilder tree=new StringBuilder("Oak");
        StringBuilder tree1=new StringBuilder("Oak").append(" 14");
        System.out.println(tree);
        System.out.println(tree1);




    }
}
