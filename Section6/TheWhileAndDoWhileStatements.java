package Section6;

public class TheWhileAndDoWhileStatements {
    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        int p = 0;
        boolean isReady = false;
        do {
            if (p > 5) {
                break;
            }
            System.out.println(p); 
            p++;
            isReady = (p > 0);
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;

            //skips printing out when condition is met
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
