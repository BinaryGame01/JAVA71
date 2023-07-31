import java.util.Scanner;

public class BR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = x * 60;
            float b = y / 30;
            System.out.println(b);
        }
        
        scanner.close();
    }
}
