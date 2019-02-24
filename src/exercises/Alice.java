package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        // write code in here that you want to execute
        // declare variables
        Scanner in;
        String searchTerm;
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        // get search term from user
        in = new Scanner(System.in);
        System.out.println("Enter the phrase you would like to search: ");
        searchTerm = in.nextLine();

        // convert to lower case
        searchTerm = searchTerm.toLowerCase();
        str = str.toLowerCase();

        // is search term found in string
        if (str.contains(searchTerm)) {
            System.out.println("The term '" + searchTerm + "' has been found!");
        } else {
            System.out.println("The term '" + searchTerm + "' has not been found!");
        }
    }
}
