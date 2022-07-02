public class Main {
    public static void main(String[] args) {
        // mile to km
//        // double kilometers = (100 * 1.609344);
//        int highScore = 50;
//
//        if (highScore == 50) {
//            System.out.println("This is an expression");
//        }
//
//        int myVariable = 50;
//        myVariable++;
//        myVariable--;
//        System.out.println("This is a test");
//
//        System.out.println("This is " +
//                "another " +
//                "still more.");
//
//        int anotherVariable = 50;
//        myVariable--;
//        System.out.println("This is another one");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("You score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}