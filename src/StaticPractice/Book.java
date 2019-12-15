package StaticPractice;

public class Book {


     String name;
     //I wanna only store the business books
     String kind;
     //It will be always same author(Jim Rohn)
     String author;
     int pages;

     int count;

     //instance initialization block
    //we ara using this block to initialize our instance variables

    {
        kind="Business Book";
        author="Jihm Rohn";
        count++;
        System.out.println("this is instance initilization block");
    }
    static{
        //we are using static block to initialize our instance variables
        System.out.println("this is static block.I am running only one time.");
    }


    public Book (String name,int pages){
        this.name=name;
        this.name=name;
    }

    }

