public class SecondsMinutes {
    // je kan de class beter in String format zetten ipv int

    public static int getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid value");
            return -1;
        }
        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;
        System.out.println(hours + "h " + minutesRemaining + "m " + seconds + "s ");

        return -1;
    }
    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            return -1;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
