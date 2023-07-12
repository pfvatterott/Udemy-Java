package Section5;

public class methodsChallengs {
    public static void main(String[] args) {
        int score = 1500;
        int playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition("Barry", playerPosition);

        score = 1000;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition("Jerry", playerPosition);

        score = 500;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition("Luke", playerPosition);

        score = 100;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition("Tom", playerPosition);

        score = 25;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition("Paul", playerPosition);
       
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");    
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
