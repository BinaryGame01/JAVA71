import java.util.Scanner;
public class BS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    float x = sc.nextInt();
		    float y = sc.nextInt();
		    float z = sc.nextInt();
		    float avg = (x+y)/2 ;
		    if(avg>z) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}