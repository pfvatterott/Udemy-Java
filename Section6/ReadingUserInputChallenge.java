package Section6;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int total = 0;
        do {
            try {
                System.out.println("Enter number #" + number);
                String userNumber = scanner.nextLine();
                //if you want to use decimals
                // double doubleUserNumber = Double.parseDouble(userNumber);
                int intUserNumber = Integer.parseInt(userNumber);
                total = total + intUserNumber;
                number++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Number. Try again.");
            }
        } while (number <= 5);
        System.out.println("Your total is " + total);
    }

}
