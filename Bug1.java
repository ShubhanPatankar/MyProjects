import java.util.Scanner;
public class Bug1 {
    // read one line of input typed by the user
// create a copy of the input that is the same except
//    all spaces are removed
//    all underscores are replaced by dashes
// print the copy
    public static void main(String[] args) {
// read 1 line of input
        Scanner sc = new Scanner(System.in);
        System.out.print("type one line: ");
        String oneLine = sc.nextLine();
        String copy = "";
// remove spaces and turn underscores into dashes
        for (int j = 0; j < oneLine.length(); j++) {
            char oneChar = oneLine.charAt(j);
            switch (oneChar) {
                case '_':
// add a dash to the copy
                    copy = copy + "-";
                case ' ':
// do nothing since we don't want to add spaces to our copy
                default:
// add the current character to the copy
                    copy = copy + oneChar;
            }
        }
// print the copy
        System.out.println("Here is the copy (in quotes): \"" + copy +
                "\"");
    }
}

