import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.println("Please enter your favorite number:");

        // Read the favorite number as an integer
        int favoriteNumber = scanner.nextInt();

        // Print the favorite number along with a custom message
        System.out.println("Your favorite number is " + favoriteNumber + ". That's a great choice!");

        // Close the scanner
        scanner.close();
    }
}