import java.util.Scanner;

public class AW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            int Z = scanner.nextInt();

            if (x == 0 && Z == 0) {
                break;
            }

            if (x > Z) {
                int temp = x;
                x = Z;
                Z = temp;
            }

            System.out.println(x + " " + Z);
        }

        scanner.close();
    }
}
