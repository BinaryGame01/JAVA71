import java.util.Scanner;

public class BO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Z = scanner.nextInt();
        while (Z-- > 0) {
            int m = scanner.nextInt();
            int r = scanner.nextInt();
            int p = scanner.nextInt();
            
            if ((m + r) % 2 == 1 || (r + p) % 2 == 1 || (p + m) % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
