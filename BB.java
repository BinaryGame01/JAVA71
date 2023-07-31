import java.util.Scanner;

public class BB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the credit score
        int Cred = scanner.nextInt();

        // Check if the credit score is greater than or equal to 750
        if (Cred >= 750) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
