import java.util.*;
public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t >= 1 && t <= 4) {
                System.out.println("YES");

            } else {
                System.out.println("No");

            }
        }
    }
}


