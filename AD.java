import java.util.Scanner;

public class AD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isNarcissistic = isNarcissisticNumber(N);
        if (isNarcissistic) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    private static boolean isNarcissisticNumber(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    private static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
