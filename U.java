import java.util.*;
public class U
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n; i++){
            int x = in.nextInt();
            if(x<10){
                System.out.println("Thanks for helping Chef!");
            }else{
                System.out.println(-1);
            }
        }
    }
}
