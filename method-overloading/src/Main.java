public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
//        int newScore = calculateScore("Jin", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(150);
//        calculateScore();
//        System.out.println(calcFeetAndInchesToCentimeters(10, 1));
        System.out.println(getDurationString(75L,45L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player " + " WHOEVER " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!((feet >= 0) && (inches >= 0 && inches <= 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        return calcFeetAndInchesToCentimeters(12 * feet + inches);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }

    private static String digitFormatter(long digit) {
        if (digit < 10) {
            return "0" + digit;
        }
        return String.valueOf(digit);
    }

    private static String getDurationString(long minutes, long seconds) {
        if (!(minutes >= 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        if (!(seconds >= 0 && seconds <= 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes =  minutes % 60;
        return (digitFormatter(hours) + "h" +
                digitFormatter(remainingMinutes) + "m" +
                digitFormatter(seconds) + "s");
    }


    private static String getDurationString(long seconds) {
        if (!(seconds >= 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}