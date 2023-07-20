package Section6;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }
        int storedNumber = number;
        int lastDigit = number % 10;
        int reverse = lastDigit;
        while (number >= 10) {
            reverse = reverse * 10;
            number = number / 10;
            lastDigit = number % 10;
            reverse += lastDigit;
        }
        if (storedNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
