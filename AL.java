import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        // Check divisibility by 2
        String divisibleBy2 = number % 2 == 0 ? "Yes" : "No";

        // Check divisibility by 4
        String divisibleBy4 = number % 4 == 0 ? "Yes" : "No";

        // Check divisibility by 8
        String divisibleBy8 = number % 8 == 0 ? "Yes" : "No";

        // Print the results
        System.out.println(divisibleBy2);
        System.out.println(divisibleBy4);
        System.out.println(divisibleBy8);
    }
}
