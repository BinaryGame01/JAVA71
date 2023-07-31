import java.util.Scanner;

public class C {
    static int area(int a , int b){
        return a * b;

    }
    public static void main(String S[]){
        int z;

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


        z = area(a,b);
        System.out.println(z);

    }
}
