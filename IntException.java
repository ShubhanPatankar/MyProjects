///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Is Divisible By Three
// Course:          200, 1, 2021
//
// Author:          Shubhan Patankar
// Email:           sapatankar2@wisc.edu
// Lecturer's Name: Jim Williams
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

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class IntException {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print(isDivisibleByThree(scnr));
    }

    /**
     * Determines if the input to scanner is evenly divisible by three, and
     * returns the result as a boolean. If the input to scanner is inappropriate,
     * catch the exception.
     *
     * @param  scnr  a scanner object
     * @return       true if input is evenly divisible by three, false if not
     */
    public static boolean isDivisibleByThree(Scanner scnr) {

        //TODO: try-catch block which catches incorrect input
        int num = 0;

        try{
            num = scnr.nextInt();
        }
        catch (InputMismatchException e) {
            return false;

        }

        if(num%3 == 0){
            return true;
        }
        return false;

    }

}