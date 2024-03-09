package Session_3;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter any Three Numbers:");
        x = s.nextInt();// 4
        y = s.nextInt();// 7
        z = s.nextInt();// 3

        int min = ((x < y) && (x < z)) ? x : y < z ? y : z;
        System.out.println("Minimum is = " + min);

    }
}
