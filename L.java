import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner. nextInt ();
        double accountBalance = scanner.nextDouble();

        if (x % 5 == 0 && accountBalance >= x + 0.5) {

            double newBalance = accountBalance - x - 0.5;
            System.out.printf ("%.2f" , newBalance);
        } else {
            System.out.printf( "%.2f" ,accountBalance);
        }
    }

}