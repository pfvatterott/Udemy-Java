package Section6;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(6));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number >= 10) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        if (number % 2 == 0) {
            sum += number;
        }
        return sum;
    }
}
