package InterfaceOOP2;

public interface FlashCard extends faceRecognition{
    //variable
    int SIZE =128;//public static final int SIZE=128; ===default

    //abstract method
    void location();//public abstract void location();

    //regular method
    default void regularMethod(){
        System.out.println("Regular method from flashCard Interface");
    }

    //regular method
    static void staticMethod(){
        System.out.println("Static method from flashcard Interface");
    }

}
