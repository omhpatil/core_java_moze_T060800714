package Session_3;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks Obtained: ");
        int marks = s.nextInt();
        if ((marks <= 75) && (marks >= 65)) {
            System.out.println("Class A");
        } else if ((marks <= 65) && (marks >= 55)) {
            System.out.println("Class B");
        } else if ((marks <= 55) && (marks >= 45)) {
            System.out.println("Class C");
        } else if ((marks <= 44) && (marks >= 33)) {
            System.out.println("Class D");
        }else {System.out.println("Fail");}
    }
}