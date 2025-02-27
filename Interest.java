public class Interest {

    public static void main(String[] args) {

        /* Declare the variables. */

        double principal;     // The value of the investment.
        double rate;          // The annual interest rate.
        double interest;      // Interest earned in one year.

        /* Do the computations. */

        principal = 17000;
        rate = 0.027;
        interest = principal * rate;   // Compute the interest.

        principal = principal + interest;
        // Compute value of investment after one year, with interest.
        // (Note: The new value replaces the old value of principal.)

        /* Output the results. */

        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is $");
        System.out.println(principal);

    } // end of main()

} // end of class Interest