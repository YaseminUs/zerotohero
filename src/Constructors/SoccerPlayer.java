package Constructors;

public class SoccerPlayer {
    // Create  instange variables: name, age, nationality,team, height, weight
    // Create methods to run the soccerplaeyr. it will take no paramater and print soccer player is runninh
    // Create  method to run the soccerplayer.it will take one parameter as a name of soccer player and it will print "NameOfSoccerPlayer is running"
    // Create method shoot the scoorplayer. it will take no parameter and it will print soccer player is kicking the ball
    // Create on method to shoot the soccerplayer. it will take one parameter as a speed of the shoot.
    // it will print "the speed of the shoot is"speedNumber"
    //Create one method to shoot the soccerPlayer. it will tahke two parameter as speed of the shoot and distance from the goalKeeper
    // if speed is bigger than 50 an distance from the goalKeeper is less than 25m.Print it is goal else print it is not goal.
    String name;
    int age;
    String nationality;
    String team;
    double height;
    double weight;

    public SoccerPlayer(){     // this is default constructor

    }


    public SoccerPlayer(String sname, int sage, String snationality,String steam, double sheight,double sweight){
        name=sname;
        age=sage;
        nationality=snationality;
        team=steam;
        height=sheight;
        weight=sweight;
    }
    public void run() {
        System.out.println("Soccer Player is running");
    }
    public void run(String name) {
        run();
        System.out.println(name + " is running");
    }
    public void shoot() {
        System.out.println("The Soccer Player is kicking the ball");
    }
    public void shoot(int speedNumber) {
        shoot();
        System.out.println("the speed of the shoot is " +speedNumber);
    }
    public  void shoot(int speed, int distance) {
        shoot(speed);
        if (speed > 50 && distance < 25) {
            System.out.println(" it is goal");
        } else {
            System.out.println("it is not goal");
        }
    }




}
