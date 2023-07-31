import java.util.Scanner;

public class BC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the values of N, M, and K
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();

            // Check if M is greater than or equal to N + K
            if (M >= N + K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
