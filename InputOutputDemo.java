import java.util.Scanner; // Import Scanner class for user input

public class InputOutputExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt and read an integer
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        // Prompt and read a decimal number
        System.out.print("Enter a decimal number: ");
        double userDouble = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Prompt and read a string (word or sentence)
        System.out.print("Enter a word or sentence: ");
        String userString = scanner.nextLine();

        // Output the values using different methods
        System.out.println("\nYour integer: " + userInt); // Using println

        // Using printf for formatted output
        System.out.printf("Your decimal number: %.2f%n", userDouble); // Two decimal places

        System.out.println("Your string: " + userString); // Using println

        // Close the scanner
        scanner.close();
    }
}
