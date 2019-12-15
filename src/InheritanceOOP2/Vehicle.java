package InheritanceOOP2;

public class Vehicle extends Object{

      String make;
      int year;

      public Vehicle()  {
        super();    //super class constractor
    }

      public Vehicle(String make){
          this();
          this.make = make;
      }

      public Vehicle(String make,int year){
          this(make);
          this.year = year;
      }

      public static void main(String[] args) {
          Vehicle vehicle = new Vehicle();
          Vehicle vehicle1 = new Vehicle("TOYOTA",2018);

}




}
