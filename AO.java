import java.util.Scanner;

public class AO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int result = a * a + b * b;
        System.out.println("The sum of the squares is: " + result);
    }
}
