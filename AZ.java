import java.util.*;
import java.lang.*;
import java.io.*;
class AZ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int press = sc.nextInt();
		for(int i=1;i<=press;i++)
		{
		    int now = sc.nextInt();
		    int then = sc.nextInt();
		    if(now>then)
		    {
		        int dif = now - then;
		        System.out.println(dif);   
		    }
		    else
		    {
		        int def = then - now;
		        System.out.println(def);
		    }
		}
	}
}
