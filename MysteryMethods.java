///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           mystery methods
// Course:          programming 200
//
// Author:          Shubhan Patankar
// Email:           sapatankar2@wisc.edu
// Lecturer's Name: jim williams
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
public class MysteryMethods {
    public static void main(String[] args) {

        System.out.println("Welcome to Mystery Methods!");
        char[] initialArray = {'e', 'n', 'i', 'r', 't', 'S', 'g', 'l', 'p', 'm', 'i', 'S'};
        System.out.print("Initial array: ");
        System.out.println(initialArray);
        System.out.println(" \nMethod Outputs:");

        int indexOfE = indexOfChar('e', initialArray);

        System.out.println("First call of the first Method:");
        System.out.println(indexOfE);

        int indexOfG = indexOfChar('g', initialArray);

        System.out.println("Second call of the first Method:");
        System.out.println(indexOfG);

        switchCharPos(indexOfE, indexOfG, initialArray);

        System.out.println("Call of the second Method:");
        System.out.println(initialArray);

        initialArray = reverseCharPosition(initialArray);
        System.out.println("Call of the third Method:");
        System.out.println(initialArray);

        char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int[] uhhh = createNumberArray(x, initialArray);

        System.out.println("Call of the fourth Method:");
        printInput("Fourth Method Output:", uhhh);
    }

    /**
     * This method prints the description followed by the contents of list. The list
     * begins with '[', ends with ']' and each element is separated with ', '.
     * Example: printInput( "Initial array:", new int[]{1,2,3}) Initial array: [1, 2, 3]
     * <p>
     *
     * @param description The text printed out before the list of ints.
     * @param list        The array of ints to be printed.
     */
    public static void printInput(String description, int[] list) {

        System.out.print(description);
        System.out.print(" [");

        for (int i = 0; i < list.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list[i]);
        }
        System.out.println("]");
    }

    /**
     * This method returns the index of a given character in a given array of characters.
     *
     * @param c            The character that the method is trying to find the index of.
     * @param initailArray Array of characters that the character is compared to.
     * @return The position of the char
     */
    public static int indexOfChar(char c, char[] initailArray) {

        for (int i = 0; i < initailArray.length; i++) {

            if (c == initailArray[i]) {

                return i;
            }
        }

        return -1;
    }

    /**
     * Switches the position of two given Chars in an array
     *
     * @param indexOfA index of the first char that will be switched with second char
     * @param indexOfB index of the second char that will be switched with first char
     * @param initialArray The initial array containing chars
     */
    public static void switchCharPos(int indexOfA, int indexOfB, char[] initialArray) {

        if (indexOfA < 0 || indexOfB < 0 || initialArray.length <= Math.max(indexOfA, indexOfB)) {
            return;
        }
        char temp = initialArray[indexOfA];
        initialArray[indexOfA] = initialArray[indexOfB];
        initialArray[indexOfB] = temp;
    }

    /**
     * Reverses the entire array, spelling out SimpleString
     *
     * @param initialArray An array of Chars
     * @return The array "SimpleString"
     */
    public static char[] reverseCharPosition(char[] initialArray) {

        if (initialArray.length == 0) {
            return initialArray;
        }

        char[] reversedArray = new char[initialArray.length];

        for (int i = 0; i < initialArray.length; i++) {
            reversedArray[initialArray.length - i - 1] = initialArray[i];
        }
        return reversedArray;
    }

    /**
     * Runs through the alphabet array and initial array and outputs a 1 when the
     * two match at a given position.
     *
     * @param alphabetArray array containing the alphabet in chars
     * @param initialArray array of chars
     * @return new array called newArray filled with ints ranging from 0 , 1, 2
     */
    public static int[] createNumberArray(char[] alphabetArray, char[] initialArray) {

        if (alphabetArray.length == 0 || initialArray.length == 0) {
            return new int[alphabetArray.length];
        }

        int[] newArray = new int[alphabetArray.length];

        for (int i = 0; i < alphabetArray.length; i++) {
            for (int j = 0; j < initialArray.length; j++) {
                if (Character.toUpperCase(initialArray[j]) == Character.toUpperCase(alphabetArray[i])) {
                    newArray[i] += 1;
                }
            }
        }

        return newArray;

    }
}
