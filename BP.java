import java.util.Scanner;

public class BP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();  // Length of the Theatre Square
        long m = scanner.nextLong();  // Width of the Theatre Square
        long a = scanner.nextLong();  // Length of each flagstone

        //Calculate the number of flagstones needed
        long flagstones = (n + a - 1) / a * ((m + a - 1) / a);

        System.out.println(flagstones);
    }
}

		 	     	  	 			 				 	 	  		