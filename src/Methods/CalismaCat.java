package Methods;

public class CalismaCat {

    // (name, age, color, boolean isRunning; , kind, speed)

    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;
    int currentspeed;

    public void catInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("kind : " + kind);
        System.out.println("color : " + color);

    }

    public boolean Start() {
        isRunning = true;
        return true;
    }

    public boolean Stop() {
        isRunning = false;
        return true;
    }
    public void run(){


        System.out.println("the cat is running");
    }
    public void accelerate(int targetSpeed) {
        int currentSpeed=speed;
        while(currentSpeed<=targetSpeed){
            System.out.print(currentSpeed);// 0 1 2 3 4 5 6
            speed=currentSpeed;
            currentSpeed++;
        }
    }
    public void slowDown(int targetSpeed) {
        for(int i=speed;speed>targetSpeed;i--){
            System.out.print(i);
            speed=i;
        }
    }

    public static void main(String[] args) {

        CalismaCat matsi = new CalismaCat();
        matsi.name =" matsi";
        matsi.age = 1;
        matsi.color = " gray";
        matsi.kind = " siyam";
        matsi.catInfo();
        matsi.Start();
        matsi.catInfo();
        matsi.Stop();
        matsi.accelerate(10);
        matsi.catInfo();
        matsi.slowDown(5);
        matsi.Start();
        matsi.Stop();
        matsi.catInfo();

    }

}
