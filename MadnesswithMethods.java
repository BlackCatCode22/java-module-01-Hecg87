import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        String myStr1 = "Hello";
        String myStr2 = "Hellos";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum); // Print the sum of x + y
    }
}