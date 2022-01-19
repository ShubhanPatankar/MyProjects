///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           print array and sums of rows
// Course:          CS 200, 1, 2021
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
public class PrintArray{
    public static void print(int[][] list){
       int sum = 0;
        for (int[] x : list)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.print(sum);
            sum = 0;
            System.out.println();
        }
    }
}

