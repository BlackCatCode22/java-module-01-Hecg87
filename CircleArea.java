import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Output the result
        System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);

        // Close the scanner
        scanner.close();
    }
}