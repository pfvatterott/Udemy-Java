package Section6;

public class GreatestCommonDivisor {
     public static void main(String[] args) {
        
     }

     public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int largestDivisor = 0;
        int largestNumber = 0;
        if (first > second) {
            largestNumber = first;
        }
        else {
            largestNumber = second;
        }
        for (int i = 0; i <= largestNumber; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
     }
}
