package Section5;

public class moreOnMethods {
    
     public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        System.out.println("The new high score is " + calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
