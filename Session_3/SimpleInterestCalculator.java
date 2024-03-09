package Session_3;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal =");
        long p = s.nextLong();
        System.out.println("Enter rate of interest =");
        float r = s.nextFloat(); // Use float for rate of interest
        System.out.println("Enter time period in years=");
        long t = s.nextLong();

        // Calculate simple interest
        float interest = (p * r * t) / 100; // Use float for interest
        float total = p + interest; // Calculate total amount

        // Display the result
        System.out.println("Simple interest on the given principal is  = " + interest);
        System.out.println("Total amount you will receive after " + t + " years is : " + total + " after "
                + "investing an amount of " + p);

    }
}