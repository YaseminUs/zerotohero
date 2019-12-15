package InterfaceOOP;

public interface Store {

    //all variables of interface by deafult are:
    //public static final
    //public static final int capacity ---- if is deaafult

    int CAPACITY = 20;
    //public abstract void sellItem ---public accsess modifier

    void sellItem();

    int countEmployees();

    default void displayItem(){
        System.out.println("Displaying item in Store Interface");

    }
}
