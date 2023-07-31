import java.util.Scanner;

public class AK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        // Extract the first digit
        int firstDigit = Character.getNumericValue(num.charAt(0));

        // Extract the last digit
        int lastDigit = Character.getNumericValue(num.charAt(num.length() - 1));

        // Calculate the sum
        int sumOfFirstAndLastDigit = firstDigit + lastDigit;

        // Print the result
        System.out.println(sumOfFirstAndLastDigit);
    }
}
