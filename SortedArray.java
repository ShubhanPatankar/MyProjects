///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Sort Array
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

public class SortedArray {

        public static boolean inOrder(int [] nums) {
            for(int i = 0;  i < nums.length-1; i++){
                if (nums[i] > nums[i+1]){
                    return false;
                }

            }
            return true;
        }

        public static void main(String[] args) {

            // Test out-of-order example.
            int [] nums1 = {5, 6, 7, 8, 3};

            if(inOrder(nums1)){
                System.out.println("In order");
            }else{
                System.out.println("Not in order");
            }

            // Test in-order example.
            int [] nums2 = {5, 6, 7, 8, 10};

            if(inOrder(nums2)){
                System.out.println("In order");
            }else{
                System.out.println("Not in order");
            }
        }
    }
