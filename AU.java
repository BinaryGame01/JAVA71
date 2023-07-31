import java.util.Scanner;

public class AU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        // Determine if the circle is inside the rectangle
        String result = isCircleInsideRectangle(W, H, x, y, r);

        // Print the result
        System.out.println(result);
    }

    public static String isCircleInsideRectangle(int W, int H, int x, int y, int r) {
        if (x - r >= 0 && x + r <= W && y - r >= 0 && y + r <= H) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
