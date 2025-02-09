import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer.");
        int first = scanner.nextInt();

        System.out.println("Enter the second integer");
        int second = scanner.nextInt();

        System.out.println("Enter the third integer");
        int third = scanner.nextInt();

        int largest;
        if (first > second) {
            if (first > third) {
                largest = first;
            } else {
                if (second > third) {
                    largest = second;
                } else {
                    largest = third;
                }
            }

            System.out.println("The largest integer is: " + largest);
            scanner.close();
        }
    }
}