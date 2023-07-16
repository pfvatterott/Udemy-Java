package Section6;

public class ASwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printWeekDay(3);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(dayOfWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        }
        else if (day == 1) {
            dayOfWeek = "Monday";
        }
        else if (day == 2) {
            dayOfWeek = "Tuesday";
        }
        else if (day == 3) {
            dayOfWeek = "Wednesday";
        }
        else if (day == 4) {
            dayOfWeek = "Thursday";
        }
        else if (day == 5) {
            dayOfWeek = "Friday";
        }
        else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
