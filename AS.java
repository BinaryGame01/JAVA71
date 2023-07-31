import java.util.Scanner;

public class AS{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter three integers (space-separated): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Compare the integers
        String result = compareIntegers(a, b, c);

        // Print the result
        System.out.println("Comparison result: " + result);

        // Close the scanner
        scanner.close();
    }

    public static String compareIntegers(int a, int b, int c) {
        if (a < b && b < c) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
