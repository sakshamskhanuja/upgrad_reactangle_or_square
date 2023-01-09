import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the sides.
        Scanner scanner = new Scanner(System.in);

        // Stores the length.
        int length = scanner.nextInt();

        // Stores the breadth.
        int breadth = scanner.nextInt();

        // Checks if sides are of a square.
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}