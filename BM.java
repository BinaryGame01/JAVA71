import java.util.Scanner;

public class BM {
    public static void main(String[] args) {
        // Declare variables
        int l, a, b;

        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input integers
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Calculate the area of the rectangle
        l = a * b;

        // Divide the area by 2 and print the result
        System.out.println(l / 2);
    }
}
