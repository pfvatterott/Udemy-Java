package Section6;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i == 1 || i == number) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= number; j++) {
                        if (j == 1 || j == number) {
                            System.out.print("*");
                        } else if (j == i) {
                            System.out.print("*");
                        } else if (j == (number - i + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
