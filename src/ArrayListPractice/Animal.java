package ArrayListPractice;

public class Animal {
    //TASK
    //create one Animal class
    //instance variables are name, age,area,dailyMeal
    //create no argument constractor
    //create 4 argument constructor and initialize instance varables
    //create one method it will increase dailyMeal with 10kg;

    //create another AnimalTest class
    //create 5 instance of the Animal class
    //create one ArrayList and store your Animal to the ArrayList
    //using for loop increase daily meal of your all object
    String name;
    int age;
    String area;
    int dailyMealkg;
    public Animal (){
    }
    public  Animal (String name, int age, String area, int dailyMealkg){
        this.name=name;
        this.age=age;
        this.area=area;
        this.dailyMealkg=dailyMealkg;
    }
    public void increasedailyMeal(){
        this.dailyMealkg+=10;
    }
}





