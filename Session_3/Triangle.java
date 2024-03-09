package Session_3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base = ");
        long b = s.nextLong();
        System.out.println("Enter Height = ");
        long h = s.nextLong();

        // Cast one of the operands to float to ensure floating-point arithmetic
        float tri = 0.5f * b * h; // Use 0.5f to specify a float literal
        System.out.println("Area of a Triangle = " + tri);
    }
}
