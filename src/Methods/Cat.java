package Methods;

public class Cat {

        // instance variables
        // (name, age, color, boolean isRunning; , kind, speed)
        String name;
        int age;
        String color;
        boolean isRunning;
        String kind;
        int speed;
        // What is the instance of the class? Means object of the class
        public boolean start(){
            isRunning=true;
            return isRunning;
        }
        public boolean stop(){
            isRunning=false;
            return isRunning;
        }
        public void run(){

            start();
            System.out.println("the cat is running");
        }
        public void run(String direction){
            System.out.println("The cat direction is "+direction);
        }
        public void run(String direction, int distance){
            System.out.println("The cat direction is "+direction + "the running distance is "+ distance);
        }
        public void catInfo(){
            System.out.println("Name "+name);
            System.out.println("Age "+age);
            System.out.println("Color "+color);
            System.out.println("Kind "+kind);
            System.out.println("Speed "+speed);
            System.out.println("IsRunning "+isRunning);
        }
        // current 0 -- target speed is 6
        public void accelerate(int targetSpeed){
            int currentSpeed=speed;
            while(currentSpeed<=targetSpeed){
                System.out.print(currentSpeed);// 0 1 2 3 4 5 6
                speed=currentSpeed;
                currentSpeed++;
            }
        }
        //current speed 6 --- targetSpeed 3
        public void slowDown(int targetSpeed){
            for(int i=speed;speed>targetSpeed;i--){
                System.out.print(i);
                speed=i;
            }
        }
        public static void main(String[] args) {
            Cat dodo=new Cat();
            dodo.name="dodo";
            dodo.age=1;
            dodo.color="Gray";
            dodo.kind="Scottish";
            dodo.catInfo();
            dodo.start();
            dodo.catInfo();
            dodo.stop();
            dodo.catInfo();
            dodo.start();
            dodo.accelerate(10);
            System.out.println();
            dodo.slowDown(5);
            dodo.catInfo();
        }
    }

