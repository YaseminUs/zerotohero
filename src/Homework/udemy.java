package Homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class udemy {
    //Write a program with two int variables, int x and int y, and give each one a value.
    // Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and y are the same”.
    // Change the values and run the program a few times to check it works.


    public static void main(String[] args) {
        int x = 7;
        int y = 8;

        if (x > y) {
            System.out.println("x bigger than y " + (x > y));
        } else if (x < y) {
            System.out.println("x smaller than y " + (x < y));
        } else {
            System.out.println("x and y are same " + (x == y));
        }
        //Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
        //If the player guesses right, print “Correct! Aren’t you lucky.“.
        //If the player guesses wrong, print “Hard luck! Maybe next time.“.
        //You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber.


//        int random=4;
//        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
//        System.out.print("Your guess: ");
//        Scanner scanner = new Scanner(System.in);
//        int guess = scanner.nextInt();
//
//        if (guess == random) {
//            System.out.println("Correct! Aren't you lucky.");
//        }
//        else {
//            System.out.println("Hard luck! Maybe next time.");
//        }

        //Write a program which prints numbers from 89 to 117.

        int num = 89;
        for(int i=89 ;i<=117; i++){
            System.out.println(i);
        }
      //Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.

        int count = 0;
        for(int i=0;i<=40;i++){
            System.out.println(i);
            if(count==3){
                System.out.println("Quack.");
                count = 0;
            }
        count++;
        }
        //Write a program which asks the user for a password.
        // Make the password “shark50”.
        // Each time the user enters the password incorrectly, prompt them for a password again.
        // When the user enters the password correctly, print “ACCESS APPROVED”.

//        Scanner scanner = new Scanner(System.in);
//        String input;
//        do{
//            System.out.println("enter password ");
//            input = scanner.next();
//
//        }while(!input.equals("shark50"));
//        System.out.println("acsess aprove");

        //Write a program which makes use of a loop to print the following output:
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

        for(int i=0;i<=10;i++){
            System.out.print(i + ", ");
        }

        System.out.println("\b\b.");



    }
}

