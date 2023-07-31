import java.util.Scanner;

public class BD{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of z
        int z = scanner.nextInt();

        // Check if z + 7 is greater than 170
        if (z + 7 > 170) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
