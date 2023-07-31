package Section6;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt = true;
        int sum = 0;
        int loopCount = 0;
        do {
            try {
                String userNumber = scanner.nextLine();
                int intUserNumber = Integer.parseInt(userNumber);
                sum = sum + intUserNumber;
                loopCount++;

            } catch (NumberFormatException badUserData) {
                isInt = false;
                if (loopCount == 0) {
                    System.out.println("SUM = 0 AVG = 0");
                } else {
                    long average = Math.round((double) sum / (double) loopCount);
                    System.out.println("SUM = " + sum + " AVG = " + average);
                }
            }

        } while (isInt);
    }
}
