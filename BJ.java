import java.util.Scanner;

public class BJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        int n = scanner.nextInt();

        // Process each word
        for (int i = 0; i < n; i++) {
            // Read the word
            String word = scanner.next();

            // Check if the word is too long
            if (word.length() > 10) {
                // Replace the word with the abbreviation
                String abbreviation = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            } else {
                // Print the word as is
                System.out.println(word);
            }
        }
    }
}

	  		 			 	 			    	 					 	 		