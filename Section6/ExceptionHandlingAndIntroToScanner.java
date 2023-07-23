package Section6;
import java.util.Scanner;

public class ExceptionHandlingAndIntroToScanner {
    public static void main(String[] args) {

        int currentYear = 2022;

        System.out.println(getInputFromScanner(currentYear));
    }



    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        // String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        // String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
}
