import java.util.Scanner;

public class BE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the values of x and y
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Check if y * 100 is less than or equal to x * 107
            if (y * 100 <= x * 107) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
