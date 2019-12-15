package Constructors;

public class ComputerClass {


    //Task
    //instance variables is    name, operatingSystem, brand, model, year, memory,inch(private)
    //create no arguments constructer
    //create 4 arguments constructor for name,operatingSystem, brand, model,
    //create 3 arguments constructor for year,memory,inch
    //create 7 arguments constructor and call 4 arguments constructer to initialize the instance variables


    //private variables only accessible inside the class
    private String name;
    private String operatingSystem;
    private String brand;
    private String model;
    private int year;
    int memory;
    private int inch;

    //int memory;  =----> if you dont give any access modifier, it is default access
    //defoult---> only accesible inside same packege
    //protected---->



    public ComputerClass() {

    }

    public ComputerClass(String name, String operatingSystem, String brand, String model) {
        this(2015, 8, 13);
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.model = model;
    }

    public ComputerClass(int sYear, int sMemory, int sInch) {
        year = sYear;
        memory = sMemory;
        inch = sInch;

    }

    public ComputerClass(String name, String operatingSystem, String brand, String model, int year, int memory, int inch) {
        this(name, operatingSystem, brand, model);
        this.year = year;
        this.memory = memory;
        this.inch = inch;
    }
    //task
    //create getter and setter for following instance variables name, operatingSystem,brand,model
     /*  public class Child{

         private int age;
         public int getAge(){
         return age;
         }
        public void setAge(int age){
        this.age=age;
        */
        public String getName(){
            return name;
        }
        public void  setName(String name){
            this.name=name;
        }
        public String getOperatingSystem() {
            return operatingSystem;
        }
        public void  setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }
        public int getYear(){
            return year;
        }

}







