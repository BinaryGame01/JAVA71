import java.util.Scanner;

public class AM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();  // Read the input as a string

        String middleDigits = n.substring(1, 3);  // Extract the middle two characters

        int result = Integer.parseInt(middleDigits);  // Convert the extracted characters to an integer

        System.out.println(result);  // Print the resulting integer
    }
}
