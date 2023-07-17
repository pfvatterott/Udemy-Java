package Section6;

public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int totalNumbers = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum = sum + i;
                System.out.println(i);
                totalNumbers++;
                if (totalNumbers == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }

    
}
 