package Constructors;

public class SoccerPlayerTest {

    public static void main(String[] args) {

        SoccerPlayer player=new SoccerPlayer();  // SoccerPlayer is default constructor
        player.name="Ronaldo";
        player.age=34;
        player.nationality="Portugal";
        player.team="Juventus";
        player.height=6.1;
        player.weight=93.1;
        player.run();
        player.run(player.name);
        player.shoot(55);
        System.out.println("**************");
        player.shoot(45,25);
        System.out.println("****************");
        player.shoot(60,20);
        System.out.println("**********************");


        SoccerPlayer player1=new SoccerPlayer("Messi",32,"Argentina","Barcelona",5.7,75.4);
        System.out.println(player1.name);
        System.out.println(player1.team);
        System.out.println(player1.age);
        player1.run(player1.name);
        player1.shoot(55);
        player1.shoot(60,20);


        // Create object Eden Hazard
        // age:29 ,Belgium, Real Madrid , 5.10, 83


        SoccerPlayer player2=new SoccerPlayer("Eden Hazard",20,"Belgium","Real Madrid",5.10,83);
        System.out.println(player2.name);
        //it will not compile if i dont have constructors





    }
}



