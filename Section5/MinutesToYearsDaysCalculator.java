package Section5;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = 0;
            if (minutes >= 60) {
                int remainingMinutes = ((int) minutes) % 60;
                hours = (((int) minutes) - remainingMinutes) / 60;
            }
            int days = 0;
            if (hours >= 24) {
                int remainingHours = hours % 24;
                days = (hours - remainingHours) / 24;
            }
            int years = 0;
            if (days >= 365) {
                int remainingDays = days % 365;
                years = (days - remainingDays) / 365;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            } else {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }
}
