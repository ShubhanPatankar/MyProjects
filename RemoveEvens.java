///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Remove the Evens in an Array
// Course:          200, 1st, 2021
//
// Author:          Shubhan Patankar
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
import java.util.Arrays;

public class RemoveEvens {

   public static int[] removeEvens(int [] nums) {

       if (nums.length == 0){
           return null;
       }
       if (nums.length == 1 && nums[0] % 2 > 0){
           return nums;
       }

       int oddCount = 0;
       for(int i = 0; i < nums.length; i++){
           if (Math.abs(nums[i] % 2) > 0){
                oddCount++;
           }
       }
       int [] arr = new int[oddCount];
       oddCount = 0;
       for(int j = 0; j < nums.length; j++){
           if (Math.abs(nums[j] % 2) >  0){
               arr[oddCount++] = nums[j];
           }
       }
       return arr;
   }

    public static void main(String[] args) {

        int [] input = {1,2,3,4,5,6,7,8,9};
        int [] result = removeEvens(input);

        // Helper method Arrays.toString() converts int[] to a String
        System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
    }
}
