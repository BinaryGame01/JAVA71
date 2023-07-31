import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0; int sum =0, mul=1;

          while(n>0){
              s = n % 10;
              n = n/10;
              sum = sum + s;
              mul = mul * s;

          }
        System.out.println(sum);
        System.out.println(mul);

    }
}
