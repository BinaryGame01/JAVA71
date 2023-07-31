import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int B = sc.nextInt();
            if (B <= 15) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        }
    }
}

