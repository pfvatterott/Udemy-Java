package Section6;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        int largestPrime = 0;
        for (int i = 1; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime && (number % i == 0)) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }
}
