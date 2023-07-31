import java.util.Scanner;

public class AP
{
    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // Calculate the cube
        int cube = x * x * x;

        // Print the result
        System.out.println(cube);

        // Close the scanner
        scanner.close();
    }
}
