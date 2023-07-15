package Section5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3661));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = 0;
        if (seconds > 59) {
            int remainingSeconds = seconds % 60;
            minutes = (seconds - remainingSeconds) / 60;
        }
        
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        int hours = 0;
        if (minutes > 59) {
            int remainingMinutes = minutes % 60;
            hours = (minutes - remainingMinutes) / 60;
            return (hours + "h " + remainingMinutes + "m " + seconds);
        }
        else {
            return (hours + "h " + minutes + "m " + seconds);
        }
        
    }
}
