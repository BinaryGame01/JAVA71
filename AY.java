import java.util.Scanner;

public class AY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] arr = new int[n];
            String inp = scanner.nextLine();
            String[]inpArr = inp.split(" ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(inpArr[j]);
            }

            int countNegative = 0;
            boolean hasZero = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] < 0) {
                    countNegative++;
                } else if (arr[j] == 0) {
                    hasZero = true;
                }
            }

            if (countNegative % 2 == 0 || hasZero) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }

        scanner.close();
    }
}
