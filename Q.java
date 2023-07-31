import java.util.Scanner;

class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int totalSlicesRequired = N * X;
            int pizzasNeeded = totalSlicesRequired / 4;

            if (totalSlicesRequired % 4 != 0) {
                pizzasNeeded++;
            }

            System.out.println(pizzasNeeded);
        }
    }
}






//import java.util.*;
//public class Q
//{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        for(int i=0; i<m; i++){
//            double n = in.nextDouble();
//            double x = in.nextDouble();
//
//            int ans = (int)Math.ceil((n*x)/4);
//            System.out.println(ans);
//        }
//    }
//}
