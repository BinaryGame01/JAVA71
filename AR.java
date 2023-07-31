import java.util.Scanner;

public class AR {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter the number of seconds: ");
        int S = scanner.nextInt();

        // Convert seconds to h:m:s
        int hours = S / 3600;
        int minutes = (S % 3600) / 60;
        int seconds = (S % 3600) % 60;

        // Format the result
        String result = hours + ":" + minutes + ":" + seconds;

        // Print the result
        System.out.println("Converted time: " + result);

        // Close the scanner
        scanner.close();
    }
}
