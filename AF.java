import java.util.Scanner;

public class AF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z ;
        if (n%2==0){
            z = n + 2;

        }
        else{
            z = n + 1;
        }
        System.out.println(z);

    }
}
