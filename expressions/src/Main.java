public class Main {
    public static void main(String[] args) {
//        int finalScore;
//        finalScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + finalScore);
//
//        finalScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + finalScore);
//
//        finalScore = calculateScore(false, 800, 5, 100);
//        System.out.println("Your final score was " + finalScore);

        int score, position;
        String player = "Jin";

        score = 1500;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        score = 1000;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        score = 500;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        // -1 is indicating error by default
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName +
                " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3
//        }
//        return 4;

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}