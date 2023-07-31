import java.util.Scanner;

public class BN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
