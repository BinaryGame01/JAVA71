import java.util.Scanner;

public class BA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the manipulation limit and the number of guards
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Check if Ezio can manipulate all the guards
            if (Y <= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
