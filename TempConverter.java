import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Output the converted temperature
        System.out.printf("%.1f Fahrenheit is equivalent to %.1f Celsius.\n", fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}32