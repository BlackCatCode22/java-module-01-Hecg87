import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Please enter your name:");

        // Read the user's name using the scanner
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the program.");

        // Close the scanner
        scanner.close();
    }
}