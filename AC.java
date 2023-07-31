import java.util.Scanner;

public class AC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean arm = isArmstrong(N);
        if (arm) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    private static boolean isArmstrong(int N) {
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        return sum == N;
    }
}
