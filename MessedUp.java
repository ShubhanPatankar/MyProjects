///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Grader
// Course:          CS 200, 1, 2021
//
// Author:          Shubhan Patankar, Bao-Phong Nguyen
// Email:           sapatankar2@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples (REMOVE in your code - unless Jane Doe helped you and you helped John Doe accordingly):
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
package com.company;
import java.util.Scanner;

/**
 * This class takes in a score and outputs a letter grade.
 * @author Shubhan Patankar, Bao-Phong Nguyen
 */
public class MessedUp {
    /**
     * This method takes the points from the main and compares
     * what range it is in to determine the respective letter grade.
     * @param points is the score the student achieved
     * @return A String which represents the letter grade
     */
    public static String grade(int points) {
        String letterGrade;
        if (points >= 93) letterGrade = "A";
        else if (points >= 89) letterGrade = "AB";
        else if (points >= 82) letterGrade = "B";
        else if (points >= 76) letterGrade = "BC";
        else if (points >= 68) letterGrade = "C";
        else if (points >= 55) letterGrade = "D";
        else letterGrade = "F";
        return letterGrade;
    }

    /**
     * /* Takes and input, sends it to the grade method, and then prints the return statement.
     * @param args command line-arguments
     * @return void
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scnr.nextInt();
        System.out.println("Grade: " + grade(score));
    }
}
