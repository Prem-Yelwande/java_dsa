package java_basics;
import java.util.Scanner;

/**
 * Day 1: Basic input and circle circumference calculation.
 * Demonstrates Scanner usage and Math.PI.
 */
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // needed for user input

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        // Basic validation: radius should be positive
        if (radius <= 0) {
            System.out.println("Error: Radius must be a positive number.");
            sc.close();
            return;
        }

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);

        sc.close();
    }
}
