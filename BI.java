import java.util.Scanner;

public class BI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the function numberofmultiples
        int numberofmultiples(int z) {
            return z / 3 + z / 5 - z / 15;
        }

        // Read the input integer z
        int z = scanner.nextInt();

        // Print the result of numberofmultiples(z)
        System.out.println(numberofmultiples(z));
    }
}
