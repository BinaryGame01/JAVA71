import java.util.Scanner;

public class K {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();
        for(int i = 0; i <TC; i++){
            int A = sc.nextInt();
            if (A > 20){
                System.out.println("HOT");
            }
            else{
                System.out.println("COLD");
            }

        }
    }
}
