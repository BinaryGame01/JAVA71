import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i<tc; i++){
            int spg = 50;
            int total_l = 20+20+30;
            int p = spg  - (spg * total_l)/100;
            int n = sc.nextInt();
            int z = n * p;
            System.out.println(z);









        }

    }
}
