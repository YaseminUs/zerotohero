package StaticPractice;

public class Cat {
    static int meowMix=10;
    int kitKab=8;
    // create one method will take int number
    // this method is called eatMix
    // once l call the method it will reduce number of meow mix, return type is boolean,
    // create one method, it will take one int number
    // this method called eatkit
    // once l call the method it will reduce number of KitKab
    // return type is boolean
    public static boolean eatMix(int amount){
        if(amount<=meowMix){
            meowMix-=amount;
            System.out.println("the meowMix amount " + meowMix);
            return true;
        }
        return false;
    }
    public boolean eatKit(int amount){
        if(amount<=kitKab){
            kitKab-=amount;
            System.out.println(kitKab);
            return true;
        }
        return false;
    }
}







