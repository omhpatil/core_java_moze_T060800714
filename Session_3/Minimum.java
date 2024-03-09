package Session_3;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("Enter any Two Numbers:");
		a = s.nextInt();
		b = s.nextInt();
		/*
		 * if (a<b)
		 * { System.out.println(a+" is min number");}
		 * else {System.out.println(b+" is min number");}
		 */
		// ternary operator - ?:
		int min = (a < b) ? a : b;
		System.out.println("Minimum of " + a + " and " + b + " = " + min);

	}

}