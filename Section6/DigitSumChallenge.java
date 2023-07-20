package Section6;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(2034));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        while (number >= 10) {
            number = number / 10;
            sum += number % 10;
        }
        return sum;
    }
}
