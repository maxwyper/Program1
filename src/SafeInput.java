import java.util.Scanner;

public class SafeInput {
    // Method to get a non-empty string
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = pipe.nextLine();
            if (input.length() > 0) {
                break;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
        return input;
    }
}
