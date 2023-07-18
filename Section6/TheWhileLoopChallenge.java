package Section6;

public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        
        int number = 5;
        int totalEvenNumbers = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                totalEvenNumbers++;
            }
            if (totalEvenNumbers == 5) {
                break;
            }
            number++;

            //another way to do it:

            // if (!isEvenNumber(number)) {
            //     continue;
            // }
            // System.out.println(number);
            // number++;
        }
        System.out.println("Out of " + (number - 5) + " numbers, " + totalEvenNumbers + " were even and " + (number - 5 - totalEvenNumbers) + " were odd.");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
