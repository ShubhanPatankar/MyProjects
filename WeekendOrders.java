///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Weekend Orders for Restaurant
//Course:          CS200 Fall 2020
//
//Author:          Shubhan Patankar
//Email:           sapatankar2@wisc.edu
//Lecturer's Name: Mark Renault & Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//Source or Recipient; Description
//Examples:
//Jane Doe; helped me with for loop in reverse method
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//counting for loop
//John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class WeekendOrders
{
    /**
     *
     * This method takes as input the scanner instance created from main and
     * asks the user for input on the number of orders placed on each of the
     * days on the long weekend (Saturday, Sunday, and Monday).
     * Put the number of orders for each day in an array of fixed size
     *
     *
     * @param scnr (an instance of Scanner)
     * @return an array of int which includes the number of orders
     *         placed on each day, with one day per index of the array
     */
    public static int[] getUserInput(Scanner scnr)
    {
        // DO NOT MODIFY THIS LINE
        int[] userInput = new int[3];

        // TODO: Prompt user for input on number of orders on each day
        // and store in userInput

        int satOrders = scnr.nextInt();
        int sunOrders = scnr.nextInt();
        int monOrders = scnr.nextInt();

        userInput[0] = satOrders;
        userInput[1] = sunOrders;
        userInput[2] = monOrders;

        return userInput;
    }


    /**
     *
     * This method appends all the new orders for the given day onto the
     * arraylist. It first generates a random int between 0-3 (inclusive).
     * If the int is 0: it adds "Burger" to the prevOrders list
     * If the int is 1: it adds "Fries" to the prevOrders list
     * If the int is 2: it adds "Pizza" to the prevOrders list
     * If the int is 3: it adds "Fish" to the prevOrders list
     * This process is repeated numOrders of times. The arraylist should
     * include all the new orders placed on this day appended onto the input arraylist
     *
     * @param numOrders (number of orders placed on any given day (as an int))
     * @param prevOrders (an ArrayList of String which holds the orders placed
     *         for the previous set of days)
     * @param rand (random variable instance already declared with seed in main)
     */
    public static void addOrders(int numOrders, ArrayList<String> prevOrders, Random rand)
    {
        // TODO: Append numOrders items to the prevOrders ArrayList using methodology
        // shown in method header javadoc.

        int random = rand.nextInt(3);

        for(int i = 0; i <= numOrders; i++) {
            if (random == 0) {
                prevOrders.add("Burger");
            } else if (random == 1) {
                prevOrders.add("Fries");
            } else if (random == 2) {
                prevOrders.add("Pizza");
            } else {
                prevOrders.add("Fish");
            }
        }

    }

    /** The main method should call userInput and addOrders methods
     * to create arrayList of prevOrders. Then prompt user for what food
     * to check when was first ordered
     *
     * NOTE: The user input will be 1 index based when asking for an order
     * (where as your array will be 0 indexed)
     * For example: If the user asks for when Pizza was first ordered, and
     * your prevOrders ArrayList contained [Fries, Fish, Burger, Burger, Pizza, Pizza],
     * you would print out order 5 (index 4)
     *
     */
    public static void main(String[] args)
    {
        // DO NOT MODIFY THIS LINE
        // CHANGING THE SEED WILL CREATE DIFFERENT RESULTS THAN OUR TEST FUNCTIONS
        final int SEED = 1;
        Random rand = new Random(SEED);
        Scanner scnr =  new Scanner(System.in);

        // TODO: Initialize variables and call getUserInput and addOrders
        // All the orders for the entire weekend should be in a single ArrayList
        int [] arr = new int[3];

        System.out.println("How many orders were placed Saturday?");

        System.out.println("How many orders were placed Sunday?");

        System.out.println("How many orders were placed Monday?");

        arr = getUserInput(scnr);




        // TODO: Ask user for what order to check and print out as appropriate
        // Note method header for main: user input will be 1-indexed

        return;
    }
}
