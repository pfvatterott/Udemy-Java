package Section6;

public class ParsingValuesAndReadingInput {
    public static void main(String[] args) {
        
        // String currentYear = "2022";
        // String usersDateOfBirth = "1999";
        // int year = Integer.parseInt(currentYear);
        // int dateOfBirth = Integer.parseInt((usersDateOfBirth));


        // System.out.println("Age = " + (year - dateOfBirth));

        // String usersAgeWithPartialYear = "22.5";
        // double ageWithPartialsYear = Double.parseDouble(usersAgeWithPartialYear);
        // System.out.println("The user says he's " + ageWithPartialsYear);

        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {
        
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        
        return "";
    }
}
