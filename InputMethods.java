///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Input Methods
// Course:          cs 200
//
// Author:          Shubhan Patankar
// Email:           sapatankar2@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Some methods to get user input.
 *
 * @author Jim Williams
 * @author Devesh Shah
 * @author Shubhan Patankar
 */
public class InputMethods {
    /**
     * This method asks for user input and only reads the first token on the line.
     * The token is valid if it is an integer between the min and max values.
     *
     * @param scnr    initialized Scanner
     * @param message string message
     * @param min     minimum integer variable
     * @param max     maximum integer variable
     * @return -1 if scanner passes null
     * @return -2 if max is less than min
     * @return -3 if no valid value is found in scanner
     * @return input when the while loop is exited
     */
    public static int getValidInt(Scanner scnr, String message, int min, int max) {
        if (scnr == null) {
            return -1;
        }
        if (min >= max) {
            return -2;
        }
        int num = 0;
        boolean vaild = false;
        int count = 0;
        while (vaild == false) {
            if (count > 3) {
                return -3;
            }
            System.out.println(message);
            if (scnr.hasNextInt()) {
                num = scnr.nextInt();
                if (num > min && num <= max) {
                    vaild = true;
                }
            }
            scnr.nextLine();
            count++;
        }
        return num;
    }

}

