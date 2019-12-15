package ArrayListPractice;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal("dog", 1, "Chicago", 10);
        Animal animal2 = new Animal("cat", 2, "New york", 5);
        Animal animal3 = new Animal("lion", 3, "San Diego", 15);
        Animal animal4 = new Animal("tiger", 5, "Arizona", 12);
        Animal animal5 = new Animal("Monkey", 4, "Florida", 7);
        //System.out.println(animal5.dailyMealkg);
        System.out.println(animal1.dailyMealkg);
        animal1.increasedailyMeal();
        System.out.println(animal1.dailyMealkg);
        ArrayList <Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).increasedailyMeal();
            System.out.println(animalList.get(i).dailyMealkg);
        }
    }
}




