import java.util.Scanner;

public class AX {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input values for a, b, and c
        System.out.print("Enter values for a, b, and c (space-separated): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Count the number of divisors
        int result = countDivisors(a, b, c);

        // Print the result
        System.out.println("Number of divisors: " + result);

        // Close the scanner
        scanner.close();
    }

    public static int countDivisors(int a, int b, int c) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                count++;
            }
        }
        return count;
    }
}
