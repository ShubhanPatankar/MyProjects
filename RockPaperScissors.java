///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           RockPaperScissors
// Course:          200, 1, 2021
//
// Author:          Shubhan Patankar
// Email:           sapatankar2@wisc.edu
// Lecturer's Name: Jim Willaims
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {

        Random rand = new Random(Config.SEED);
        Scanner scnr = new Scanner(System.in);
        int y = rand.nextInt(3) +1;

        System.out.print("Please select one of [R/P/S]: ");
        String x = scnr.next();
        x = x.toUpperCase();

        String yourMove;
        if (x.equals("R")){
            System.out.println("You chose: Rock");
            yourMove = "Rock";
        }
        else if(x.equals("P")){
            System.out.println("You chose: Paper");
            yourMove = "Paper";
        }
        else if(x.equals("S")){
            System.out.println("You chose: Scissors");
            yourMove = "Scissors";
        }
        else{
            System.out.println("Invalid choice! Defaulting to Rock.");
            yourMove = "Rock";
        }

        String myMove;
        if(y == 1){
            myMove = "Rock";
            System.out.println("I chose: Rock");
        }
        else if(y == 2){
            myMove = "Paper";
            System.out.println("I chose: Paper");
        }
        else {
            myMove = "Scissors";
            System.out.println("I chose: Scissors");
        }

        if(yourMove.equals("Rock") && (myMove.equals("Paper"))) {
            System.out.println("Paper beats rock - you lose!");
        }
        else if(yourMove.equals("Paper") && (myMove.equals("Rock"))) {
            System.out.println("Paper beats rock - you win!");
        }
        else if(yourMove.equals("Rock") && (myMove.equals("Scissors"))) {
            System.out.println("Rock beats scissors - you win!");
        }
        else if(yourMove.equals("Scissors") && (myMove.equals("Rock"))) {
            System.out.println("Rock beats scissors - you lose!");
        }
        else if(yourMove.equals("Scissors") && (myMove.equals("Paper"))) {
            System.out.println("Scissors beats paper - you win!");
        }
        else if(yourMove.equals("Paper") && (myMove.equals("Scissors"))) {
            System.out.println("Scissors beats paper - you lose!");
        }
        else {
            System.out.println("A Tie!");
        }
    }
}
