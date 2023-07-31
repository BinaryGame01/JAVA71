import java.util.Scanner;

public class AH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;  // Extract the hundreds digit
        int digit2 = (number / 10) % 10;  // Extract the tens digit
        int digit3 = number % 10;  // Extract the units digit

        System.out.println("Digits in separate lines:");
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
    }
}
