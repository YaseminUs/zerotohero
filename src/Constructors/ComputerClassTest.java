package Constructors;

public class ComputerClassTest {
    public static void main(String[] args) {
        ComputerClass cs=new ComputerClass();
        ComputerClass cs1=new ComputerClass("Apple","OS","Macbook","Pro");
        ComputerClass cs2=new ComputerClass(2015,8,13);

        //iMMUTABLE CLASS

        //my instance variables sholud be private
        //i need to create only getters.there is no setter for immitable class
        //we need set the value using the constructor

        System.out.println(cs.getName());//null
        System.out.println(cs.getYear());//0

        cs.setName("HP");
        System.out.println(cs.getName());
        cs.setName("Asus");
        System.out.println(cs.getName());
        System.out.println(cs1.getName());//apply
        cs1.setName("Acer");

        System.out.println(cs1.getYear());
        System.out.println(cs2.memory);
        System.out.println(cs.memory);
        cs.memory=12;
        System.out.println(cs.memory);

        //ENCAPSULATION
        //create the one class and instance variables are private
        //instance variables only accessible inside same class
        //to be able to accses in instanse variables we need to creata  getter setter methods

        //Getter methods it will return the instance variables
        //SETTER methods it will take the one parametre and set the value for our instance variables
                 //====================

      //create the array store the computers cs, cs1,cs2
        //and print the memory for all computer from array

        ComputerClass [] complist={new ComputerClass(),cs,cs1,cs2};  //if i have more computer i need loop
        for(ComputerClass cc:complist){
            System.out.println("it is from for each loop"+ cc.memory);
        }
        //System.out.println(complist[0].memory);



        //System.out.println(player2.name);
        //       SoccerPlayer[] soccerPlayers={new SoccerPlayer(),new SoccerPlayer(), player2,player1};
        //       System.out.println(soccerPlayers[2].name);




    }
}
