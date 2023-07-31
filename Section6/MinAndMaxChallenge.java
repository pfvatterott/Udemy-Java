package Section6;

import java.util.Scanner;

public class MinAndMaxChallenge {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         boolean isInt = true;
         int lowestNumber = 0;
         int highestNumber = 0;
         int loopCount = 0;
         do {
            try {
                System.out.println("Enter a number. To quit, enter a character.");
                String userNumber = scanner.nextLine();
                int intUserNumber = Integer.parseInt(userNumber);
                if (loopCount == 0) {
                    highestNumber = intUserNumber;
                    lowestNumber = intUserNumber;
                }
                if (intUserNumber > highestNumber) {
                    highestNumber = intUserNumber;
                }
                if (intUserNumber < lowestNumber) {
                    lowestNumber = intUserNumber;
                }
                loopCount++;

            } catch (NumberFormatException badUserData) {
                System.out.println("Highest number: " + highestNumber);
                System.out.println("Lowest number: " + lowestNumber);
                isInt = false;
            }
            
        } while (isInt);
    }
}
