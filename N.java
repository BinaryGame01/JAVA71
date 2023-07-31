import java.util.Scanner;

public class N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i =0;i<tc ;i++) {

            int ft = sc.nextInt();
            int fd = sc.nextInt();
            int st = sc.nextInt();
            int sd = sc.nextInt();
            int x = ft - fd;
            int y = st - sd;

            System.out.println("first price after discount " + x );
            System.out.println("first price after discount " + y);
            if(x<y){
                System.out.println("First");
            } else if (y<x) {
                System.out.println("Second");


            }
            else{
                System.out.println("Any");
            }


        }
    }
}
