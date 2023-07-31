import java.util.Scanner;

public class BL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n > 100) {
                System.out.println(n - 10);
            } else {
                System.out.println(n);
            }
        }
    }
}
