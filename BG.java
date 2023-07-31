import java.util.Scanner;

public class BG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the values of a, b, c, and d
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            // Check if c >= a and d >= b
            if (c >= a && d >= b) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
