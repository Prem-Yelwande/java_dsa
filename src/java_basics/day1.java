package java_basics;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // needed for user input

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);

        sc.close();
    }
}
