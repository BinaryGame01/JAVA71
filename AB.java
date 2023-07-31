import java.util.Scanner;
public class AB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a =0;
        int b =1;
        int c;
        for(int i=0; i<n; i++) {
            c = a +b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}




//import java.util.Scanner;
//
//public class AB {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int result = fibonacci(N);
//        System.out.println(result);
//    }
//
//    public static int fibonacci(int N) {
//        if (N <= 1)
//            return N;
//        int a = 0;
//        int b = 1;
//        int fib = 0;
//        for (int i = 2; i <= N; i++) {
//            fib = a + b;
//            a = b;
//            b = fib;
//        }
//    }
//}