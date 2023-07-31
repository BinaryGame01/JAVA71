import java.util.Scanner;

public class W {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int fact = 1;
        if (N > 0) {
            for (int i = 1; i<= N; i++) {
                fact = fact * i;


            }
            System.out.println(fact);
        }
        else {
            System.out.println("1");
        }
    }
}