import java.util.Scanner;

public class AV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int x = scanner.nextInt();

            if (x == 0) {
                break; //Terminate the program if x is 0
            }

            System.out.println("Case " + caseNumber + ": " + x);
            caseNumber++;
        }
    }
}

