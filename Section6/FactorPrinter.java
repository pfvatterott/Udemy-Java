package Section6;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        String result = "";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result = result + " " + i;
            }
        }
        System.out.println(result);
    }
}
