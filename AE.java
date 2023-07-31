import java.util.Scanner;

public class AE {
    public static int peri(int a , int b){
        return 2 *( a + b);




    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = peri(x, y);
        System.out.println(z);


    }

}