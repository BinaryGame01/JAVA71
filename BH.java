import java.util.Scanner;

public class BH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer N
        int N = scanner.nextInt();

        // Print the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }
    }
}
