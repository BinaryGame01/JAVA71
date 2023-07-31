import java.util.Scanner;

public class M {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i =0;i<tc;i++){
            int d =  sc.nextInt();
            int p = 100 - (100*d)/100;
            System.out.println(p);

        }

    }
}
