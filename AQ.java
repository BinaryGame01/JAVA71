import java.util.Scanner;

public class AQ {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Calculate area and perimeter
        int[] result = calculateAreaAndPerimeter(length, breadth);

        // Print the result
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] calculateAreaAndPerimeter(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        int[] result = { area, perimeter };
        return result;
    }
}
