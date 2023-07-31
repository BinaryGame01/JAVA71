import java.util.Scanner;

public class D {
    public static void main(String S[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b > c && b+c > a && c+a> b ){
            System.out.println("YES");

        }
        else {
            System.out.println("NO");
        }


    }
}

