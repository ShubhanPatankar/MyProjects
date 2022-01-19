///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Test Input Methods
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


import java.util.ArrayList;
import java.util.Scanner;

/**
 * This contains testing methods for the InputMethods class.
 *
 * @author Jim Williams
 * @author Devesh Shah
 * @author Shubhan Patankar
 */
public class TestInputMethods {

    /**
     * This main method runs the selected tests.  Comment out a test if you don't want it to run.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        testGetValidInt();
    }

    /**
     * Tests that the getValidInt method handles all the cases described in the assignment.
     */
    private static void testGetValidInt() {
        boolean error = false;

        //see assignment for the test cases
        //test1
        { //creates a new scope so that the variables declared within it don't affect others in
            // this same method.

            //simulates a user typing 9 then Enter.
            Scanner input = new Scanner("9\n");

            //the value expected to be returned by getValidInt for this test case.
            int expected = 9;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            //if the actual value returned doesn't equal the expected then this is an error.
            if (actual != expected) {
                error = true;

                //a message describing the error so that the programmer can find this test and
                //see what the values were.
                System.out.println("testGetValidInt 1) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test2
        {
            Scanner input = null;
            int expected = -1;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 2) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test3
        {
            Scanner input = new Scanner("9\n");
            int expected = -2;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 11, 5);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 3) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test4
        {
            Scanner input = new Scanner("4 89 8 56\n8 5 4");

            int expected = 8;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 4) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test5
        {
            Scanner input = new Scanner("hello 8 8 56\n7 5 4");

            int expected = 7;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 5) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test 6
        {
            Scanner input = new Scanner("hello 8 8 56\n hello 7 5 4\n6");

            int expected = 6;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 6) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        //test 7
        {
            Scanner input = new Scanner("hello 8 8 56\n hello 7 5 4\nhello 6");

            int expected = -3;

            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 7) Error, expected: " + expected
                        + ", actual: " + actual);
            }
        }

        if (error) {
            System.out.println("testGetValidInt failed");
        } else {
            System.out.println("testGetValidInt passed; it is expected that the prompt and " +
                    "getValidInt error messages are printed out.");
        }
    }
}

