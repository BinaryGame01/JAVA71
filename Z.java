import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for ( int i = 1; i <= n; i++){
            int s = i*i*i;

            sum = sum + s;
        }
        System.out.println(sum);

    }
}
