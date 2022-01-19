import java.util.Scanner;
public class Bug2 {
    // read one line of input typed by the user
// create a copy of the input that is the same except
//    the line is reversed
//    all spaces are removed
//    all upper-case letters are replaced by lower case
// print the copy
    public static void main(String[] args) {
// read 1 line of input
        Scanner sc = new Scanner(System.in);
        System.out.print("type one line: ");
        String oneLine = sc.nextLine();
        String copy1 = "";
// create a copy with spaces removed
        for (int j = 0; j < oneLine.length(); j++) {
            char oneChar = oneLine.charAt(j);
            if (oneChar != ' ') {
                copy1 += oneChar;
            }
        }
// now create a second copy with upper-case letters replaced by
// lower case
        String copy2 = "";
        for (int j = 0; j < copy1.length(); j++) {
            String oneChar = copy1.substring(j, j+1);
            copy2 += oneChar.toLowerCase().charAt(0);
        }
// now create the final copy, which is the second copy reversed
        String copy3 = "";
        for (int j = copy2.length()-1; j>0; j--) {
            copy3 += copy2.charAt(j);
        }
// print the copy
        System.out.println("Here is the copy (in quotes): \"" + copy3 +
                "\"");
    }
}