import java.util.*;
public class AT
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0 ; i<3; i++){
		    num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		System.out.print(num[0] + " ");
		System.out.print(num[1] +" ");
		System.out.print(num[2]+ " ");
				
		
		
	}
}
